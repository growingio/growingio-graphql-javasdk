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

public class GrowingioAnalysisApiExaples {

    static String projectId = "WlGk4Daj"; //如果资源不在项目中，那么就没有projectId参数
    final static GrowingioApi growingioApi = GrowingioApi.apply("http://uat-gdp.growingio.com/graphql", "Authorization", "fab69b1f-35c1-4cb5-81e8-ebe167ee2366");

    public static void main(String[] args) {
        AnalysisExportJobDto analysisChartsExportJobDto = growingioApi.submitAnalysisExportJob(projectId, "kqQewGry", AnalysisExportJobParamDto.builder().setAnalysisType(CHARTS).build(), "UTF-16LE");
        System.out.println(analysisChartsExportJobDto);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }        boolean isDone = false;
        JobResultDto jobResultDto = JobResultDto.builder().build();
        while (!isDone){
            //set对应的id
            jobResultDto = growingioApi.jobResult(analysisChartsExportJobDto.getId());
            if (jobResultDto.getUris().size()!=0) {
                isDone = true;
            }else if (analysisChartsExportJobDto.getStage().equals(ERROR)) {
                isDone = true;
                System.out.println(jobResultDto + "下载失败");
            }
        }
        System.out.println(jobResultDto);
    }
}
