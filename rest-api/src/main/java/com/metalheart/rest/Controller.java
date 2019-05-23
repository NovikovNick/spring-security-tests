package com.metalheart.rest;

import com.metalheart.Model;
import com.metalheart.service.Service;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.net.HttpURLConnection;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/test")
@Api(value = "Sample", description = "Sample")
public class Controller {

    @Autowired
    private Service service;

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Get sample model list")
    @ApiResponses(value = @ApiResponse(code = HttpURLConnection.HTTP_OK, message = "If everything is ok"))
    public List<Model> get() {
        return service.get();
    }
}
