package com.wang.user.controller;

import com.wang.user.entity.UmsMember;
import com.wang.user.service.UmsMemberService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 会员(UmsMember)表控制层
 *
 * @author makejava
 * @since 2020-06-23 07:56:46
 */
@RestController
@RequestMapping("umsMember")
public class UmsMemberController {
    /**
     * 服务对象
     */
    @Resource
    private UmsMemberService umsMemberService;

    @GetMapping(value = "index")
    public String index(){
        return "index";
    }
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UmsMember selectOne(Long id) {
        return this.umsMemberService.queryById(id);
    }

}