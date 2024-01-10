package com.coldwind.easyojbackenduserservice.controller.inner;

import com.coldwind.easyojbackendjudgeservice.common.ErrorCode;
import com.coldwind.easyojbackendjudgeservice.exception.BusinessException;
import com.coldwind.easyojbackendmodel.model.entity.User;
import com.coldwind.easyojbackendmodel.model.enums.UserRoleEnum;
import com.coldwind.easyojbackendmodel.model.vo.UserVO;
import com.coldwind.easyojbackendserviceclient.service.UserFeignClient;
import com.coldwind.easyojbackenduserservice.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.List;

import static com.coldwind.easyojbackendjudgeservice.constant.UserConstant.USER_LOGIN_STATE;

/**
 * @author ckl
 * @since 2024/1/10 1:49
 */
@RestController
@RequestMapping("/inner")
public class UserInnerController implements UserFeignClient {

    @Resource
    private UserService userService;

    /**
     * 根据 id 获取用户
     * @param userId
     * @return
     */
    @GetMapping("/get/id")
    public User getById (@RequestParam("userId") long userId){
        return userService.getById(userId);
    }

    /**
     * 根据 ids 获取用户列表
     * @param idList
     * @return
     */
    @GetMapping("/get/ids")
    public List<User> listByIds(@RequestParam("idList") Collection<Long> idList) {
        return userService.listByIds(idList);
    }
}
