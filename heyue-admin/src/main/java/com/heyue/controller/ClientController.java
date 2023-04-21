package com.heyue.controller;

import com.heyue.api.CommonResult;
import com.heyue.dto.ClientAddParam;
import com.heyue.dto.ClientParam;
import com.heyue.model.Client;
import com.heyue.model.ClientAggVO;
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
@CrossOrigin
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

    @ApiOperation("查询指定客户")
    @RequestMapping(value = "/queryClientInfo",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<ClientAggVO> queryClientInfo(@RequestParam Long client_id){
        ClientAggVO agg = clientService.loadUserByClientId(client_id);
        if(agg!=null){
            return CommonResult.success(agg);
        }
        return CommonResult.failed();
    }

    @ApiOperation("添加客户")
    @RequestMapping(value = "/addClient",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addClient(@RequestBody ClientAddParam param){
        int count = clientService.addClient(param);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }


    @ApiOperation("修改客户信息")
    @RequestMapping(value = "/updateClient",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateClient(@RequestBody ClientAggVO vo){
        int count = clientService.updateClient(vo);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("删除客户")
    @RequestMapping(value = "/deleteClient",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteClient(@RequestParam("id") Long id){
        int count = clientService.deleteClient(id);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }


}
