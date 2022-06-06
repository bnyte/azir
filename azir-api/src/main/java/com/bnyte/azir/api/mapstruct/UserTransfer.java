package com.bnyte.azir.api.mapstruct;

import com.bnyte.azir.api.vo.user.CurrentUserVO;
import com.bnyte.azir.api.vo.user.UserVO;
import com.bnyte.azir.common.entity.console.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author bnyte
 * @since 2022/5/28 7:38
 */
@Mapper
public interface UserTransfer {

    UserTransfer INSTANCE = Mappers.getMapper(UserTransfer.class);

    CurrentUserVO toCurrentUserVO(User user);

    List<UserVO> toVOS(List<User> user);

    UserVO toVO(User user);

}
