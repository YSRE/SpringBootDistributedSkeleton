package cn.sinjinsong.pay.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PayDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay.user_id
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay.username
     *
     * @mbggenerated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay.amount
     *
     * @mbggenerated
     */
    private Double amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay.detail
     *
     * @mbggenerated
     */
    private String detail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay.updater
     *
     * @mbggenerated
     */
    private Long updater;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay.update_time
     *
     * @mbggenerated
     */
    private LocalDateTime updateTime;

    
}