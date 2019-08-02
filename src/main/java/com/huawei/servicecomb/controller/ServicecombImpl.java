package com.huawei.servicecomb.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.apache.servicecomb.provider.pojo.RpcSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoDemoCodegen", date = "2019-08-02T08:13:18.299Z")

@RpcSchema(schemaId = "servicecomb")
public class ServicecombImpl implements Servicecomb{

    @Autowired
    private ServicecombDelegate servicecombDelegate;


    public String helloworld(String name) {

        return servicecombDelegate.helloworld(name);
    }

}
