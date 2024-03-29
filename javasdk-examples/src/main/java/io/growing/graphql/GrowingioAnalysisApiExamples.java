package io.growing.graphql;

import io.growing.graphql.api.GrowingioApi;
import io.growing.graphql.model.AnalysisExportJobDto;
import io.growing.graphql.model.AnalysisExportJobParamDto;
import io.growing.graphql.model.JobResultDto;

import static io.growing.graphql.model.AnalysisResourceTypeDto.CHARTS;
import static io.growing.graphql.model.AnalysisResourceTypeDto.FUNNELS;
import static io.growing.graphql.model.AnalysisResourceTypeDto.RETENTIONS;
import static io.growing.graphql.model.AnalysisResourceTypeDto.FREQUENCIES;
import static io.growing.graphql.model.JobStageDto.ERROR;

public class GrowingioAnalysisApiExamples {

    static String projectId = "WlGk4Daj"; //如果资源不在项目中，那么就没有projectId参数
    final static GrowingioApi growingioApi = GrowingioApi.apply("http://uat-gdp.growingio.com/graphql", "Authorization", "tokenId");

    //设置对应的单图id和type
    public static void main(String[] args) {
        submitJobTest("kqQewGry",AnalysisExportJobParamDto.builder().setAnalysisType(CHARTS).build());
        submitJobTest("kqQewGry",AnalysisExportJobParamDto.builder().setAnalysisType(FUNNELS).build());
        submitJobTest("kqQewGry",AnalysisExportJobParamDto.builder().setAnalysisType(RETENTIONS).build());
        submitJobTest("kqQewGry",AnalysisExportJobParamDto.builder().setAnalysisType(FREQUENCIES).build());
    }

    public static void submitJobTest (String id,AnalysisExportJobParamDto type) {
        AnalysisExportJobDto analysisChartsExportJobDto = growingioApi.submitAnalysisExportJob(projectId, id, type, "UTF-16LE");
        System.out.println(analysisChartsExportJobDto);
        boolean isDone = false;
        JobResultDto jobResultDto = JobResultDto.builder().build();
        while (!isDone){
            //set对应的id
            jobResultDto = growingioApi.jobResult(analysisChartsExportJobDto.getId());
            if (jobResultDto.getUris().size()!=0) {
                isDone = true;
            }else if (jobResultDto.getStage().equals(ERROR)) {
                isDone = true;
                System.out.println(jobResultDto + "下载失败");
                return;
            }
        }
        System.out.println(jobResultDto);
    }
}
