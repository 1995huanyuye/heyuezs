package com.heyue.controller;

import com.heyue.api.CommonResult;
import com.heyue.model.Client;
import com.heyue.serivce.ClientService;
import com.heyue.util.PKeyGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(tags = "客户管理")
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @ApiOperation("获取所有客户")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Client>> listAll(){
        List<Client> clients = clientService.listAll();
        return CommonResult.success(clients);
    }

    @ApiOperation("添加客户")
    @GetMapping(value = "/addClient")
    @ResponseBody
    public CommonResult addClient(@RequestBody Client client){
        client.setId(PKeyGenerator.generator());
        int count = clientService.addClient(client);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("修改客户信息")
    @GetMapping(value = "/updateClient")
    @ResponseBody
    public CommonResult updateClient(@RequestBody Client client){
        int count = clientService.updateClient(client);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("删除客户")
    @GetMapping(value = "/deleteClient")
    @ResponseBody
    public CommonResult deleteClient(@RequestParam("id") Long id){
        int count = clientService.deleteClient(id);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

//    @ApiOperation("添加客户")
//    @GetMapping(value = "/addClientTest")
//    @ResponseBody
//    public CommonResult addClientTest(){
//        Client client = new Client();
//        client.setId(PKeyGenerator.generator());
//        int count = clientService.addClient(client);
//        if(count>0){
//            return CommonResult.success(count);
//        }
//        return CommonResult.failed();
//    }
}
