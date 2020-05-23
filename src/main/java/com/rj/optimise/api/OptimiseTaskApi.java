package com.rj.optimise.api;

import com.rj.optimise.vo.OptimseTask;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2020-05-21T23:34:58.667+08:00")

@Api(value = "optimise-task", description = "the optimise-task API")
public interface OptimiseTaskApi {

    @ApiOperation(value = "", notes = "", response = Void.class, tags={ "optimise", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = Void.class),
        @ApiResponse(code = 500, message = "Invalid input", response = Void.class) })
    @RequestMapping(value = "/optimise-task/add",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<OptimseTask> addTask(

@ApiParam(value = "Pet object that needs to be added to the store" ,required=true ) @RequestBody OptimseTask body

);

}
