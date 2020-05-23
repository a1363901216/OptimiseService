package com.rj.optimise.controller;

import com.rj.optimise.api.OptimiseTaskApi;
import com.rj.optimise.vo.OptimseTask;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class OptimisetaskController implements OptimiseTaskApi {
    @Override
    public  ResponseEntity<OptimseTask> addTask(@ApiParam(value = "Pet object that needs to be added to the store" ,required=true )  @Valid @RequestBody OptimseTask body) {
        System.out.println("-----------------");
        System.out.println(body);
        body.setPceInstance(Integer.parseInt(body.getPceInstance()) + 1 + "");
        return new ResponseEntity<>(body,HttpStatus.OK);
    }
}
