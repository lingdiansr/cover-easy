package org.ldsr.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.locationtech.jts.geom.Geometry;

/**
 * @author 20773
 * @TableName cover
 */
@TableName(value ="cover")
@Data

public class Cover implements Serializable {
    private Integer coverId;

    private String coverBase64;

    private Date uploadTime;

    private Integer isJudged;
    @TableField(exist = false)
    private Geometry position;

    private String coverCategory;

}