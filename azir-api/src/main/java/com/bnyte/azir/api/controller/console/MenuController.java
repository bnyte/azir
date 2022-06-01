package com.bnyte.azir.api.controller.console;

import com.bnyte.azir.api.service.console.MenuService;
import com.bnyte.azir.api.vo.menu.MenuVO;
import com.bnyte.azir.common.web.response.R;
import com.bnyte.forge.annotation.APIHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author bnyte
 * @since 2022/5/31 13:09
 */
@Api(tags = "菜单路由控制器")
@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    MenuService menuService;

    @APIHelper
    @GetMapping("/list")
    @ApiOperation("菜单路由列表")
    R<List<MenuVO>> list() {
        return R.ok(menuService.menus());
    }

}
