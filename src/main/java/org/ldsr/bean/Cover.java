package org.ldsr.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @TableName cover
 */
@TableName(value ="cover")
@Data
public class Cover implements Serializable {
    @TableId
    private Integer coverId;

    private String coverBase64;

    private Date uploadTime;

    private Integer isJudged;

    private Double longitude;

    private Double latitude;

    private String coverCategory;

    @Serial
    private static final long serialVersionUID = 1L;
}