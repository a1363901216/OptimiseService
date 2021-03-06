/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.rj.optimise.api;

import com.rj.optimise.vo.OptimseTask;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
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
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-23T19:00:05.816+08:00")

@Api(value = "optimise-task", description = "the optimise-task API")
public interface OptimiseTaskApi {

    @ApiOperation(value = "", notes = "", response = OptimseTask.class, tags={ "optimise", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = OptimseTask.class),
        @ApiResponse(code = 500, message = "Invalid input", response = Void.class) })
    
    @RequestMapping(value = "/optimise-task/add",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<OptimseTask> addTask(@ApiParam(value = "Pet object that needs to be added to the store" ,required=true )  @Valid @RequestBody OptimseTask body) {
        // do some magic!
        return new ResponseEntity<OptimseTask>(HttpStatus.OK);
    }

}
