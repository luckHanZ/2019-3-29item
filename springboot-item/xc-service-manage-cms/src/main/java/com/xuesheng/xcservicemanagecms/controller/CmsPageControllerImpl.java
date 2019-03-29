package com.xuesheng.xcservicemanagecms.controller;

import com.xuecheng.api.cms.CmsPageControllerApi;
import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.domain.ucenter.response.AuthCode;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.QueryResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/cms/page")
public class CmsPageControllerImpl implements CmsPageControllerApi {

    @Override
    @PostMapping("/list")
    public QueryResponseResult findList(int page, int size, QueryPageRequest request) {
        QueryResult queryResult=new QueryResult();
        queryResult.setTotal(1);
        queryResult.setList(Arrays.asList("haha"));
        QueryResponseResult queryResponseResult=new QueryResponseResult(AuthCode.AUTH_ACCOUNT_NOTEXISTS,queryResult);
        return queryResponseResult ;
    }


    @Override
    @GetMapping("/index")
    public String index() {
        return "hello";
    }
}
