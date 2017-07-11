package cn.sinjinsong.skeleton.dao.mail;


import cn.sinjinsong.skeleton.domain.entity.mail.MailTextDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MailTextDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_text
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_text
     *
     * @mbggenerated
     */
    int insert(MailTextDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_text
     *
     * @mbggenerated
     */
    int insertSelective(MailTextDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_text
     *
     * @mbggenerated
     */
    MailTextDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_text
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MailTextDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_text
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(MailTextDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_text
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MailTextDO record);
}