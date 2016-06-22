package com.pro.test.web.dao;

import com.pro.test.web.entity.TbHxpRefComment;
import com.pro.test.web.entity.TbHxpRefCommentExample;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TbHxpRefCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_hxp_ref_comment
     *
     * @mbggenerated
     */
    int countByExample(TbHxpRefCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_hxp_ref_comment
     *
     * @mbggenerated
     */
    int deleteByExample(TbHxpRefCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_hxp_ref_comment
     *
     * @mbggenerated
     */
    @Delete({
        "delete from tb_hxp_ref_comment",
        "where ref_comment_id = #{refCommentId,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String refCommentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_hxp_ref_comment
     *
     * @mbggenerated
     */
    @Insert({
        "insert into tb_hxp_ref_comment (ref_comment_id, article_id, ",
        "comment_id, ref_comment_context, ",
        "user_id, user_name, user_head_portrait, ",
        "to_user_name, to_user_id, ",
        "ref_comment_ip, create_date)",
        "values (#{refCommentId,jdbcType=CHAR}, #{articleId,jdbcType=CHAR}, ",
        "#{commentId,jdbcType=CHAR}, #{refCommentContext,jdbcType=VARCHAR}, ",
        "#{userId,jdbcType=CHAR}, #{userName,jdbcType=VARCHAR}, #{userHeadPortrait,jdbcType=VARCHAR}, ",
        "#{toUserName,jdbcType=CHAR}, #{toUserId,jdbcType=VARCHAR}, ",
        "#{refCommentIp,jdbcType=VARCHAR}, #{createDate,jdbcType=DATE})"
    })
    int insert(TbHxpRefComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_hxp_ref_comment
     *
     * @mbggenerated
     */
    int insertSelective(TbHxpRefComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_hxp_ref_comment
     *
     * @mbggenerated
     */
    List<TbHxpRefComment> selectByExample(TbHxpRefCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_hxp_ref_comment
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ref_comment_id, article_id, comment_id, ref_comment_context, user_id, user_name, ",
        "user_head_portrait, to_user_name, to_user_id, ref_comment_ip, create_date",
        "from tb_hxp_ref_comment",
        "where ref_comment_id = #{refCommentId,jdbcType=CHAR}"
    })
    @ResultMap("BaseResultMap")
    TbHxpRefComment selectByPrimaryKey(String refCommentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_hxp_ref_comment
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TbHxpRefComment record, @Param("example") TbHxpRefCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_hxp_ref_comment
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TbHxpRefComment record, @Param("example") TbHxpRefCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_hxp_ref_comment
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TbHxpRefComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_hxp_ref_comment
     *
     * @mbggenerated
     */
    @Update({
        "update tb_hxp_ref_comment",
        "set article_id = #{articleId,jdbcType=CHAR},",
          "comment_id = #{commentId,jdbcType=CHAR},",
          "ref_comment_context = #{refCommentContext,jdbcType=VARCHAR},",
          "user_id = #{userId,jdbcType=CHAR},",
          "user_name = #{userName,jdbcType=VARCHAR},",
          "user_head_portrait = #{userHeadPortrait,jdbcType=VARCHAR},",
          "to_user_name = #{toUserName,jdbcType=CHAR},",
          "to_user_id = #{toUserId,jdbcType=VARCHAR},",
          "ref_comment_ip = #{refCommentIp,jdbcType=VARCHAR},",
          "create_date = #{createDate,jdbcType=DATE}",
        "where ref_comment_id = #{refCommentId,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(TbHxpRefComment record);
}