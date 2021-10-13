package com.eleven.icode.ispring.mapper;

import com.eleven.icode.ispring.entity.UserNew;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
@Mapper
public interface UserMapper {
    UserNew selectById(Long id);

    @Select("select * from user")
    List<UserNew> selectAllUser();
}
