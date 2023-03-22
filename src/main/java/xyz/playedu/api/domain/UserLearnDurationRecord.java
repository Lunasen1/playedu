package xyz.playedu.api.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 
 * @TableName user_learn_duration_records
 */
@TableName(value ="user_learn_duration_records")
@Data
public class UserLearnDurationRecord implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 
     */
    @JsonProperty("user_id")
    private Integer userId;

    /**
     * 
     */
    @JsonProperty("created_date")
    private Date createdDate;

    /**
     * 已学习时长[微秒]
     */
    private Integer duration;

    /**
     * 开始时间
     */
    @JsonProperty("start_at")
    private Date startAt;

    /**
     * 结束时间
     */
    @JsonProperty("end_at")
    private Date endAt;

    /**
     * 
     */
    @JsonProperty("course_id")
    private Integer courseId;

    /**
     * 
     */
    @JsonProperty("hour_id")
    private Integer hourId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UserLearnDurationRecord other = (UserLearnDurationRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getCreatedDate() == null ? other.getCreatedDate() == null : this.getCreatedDate().equals(other.getCreatedDate()))
            && (this.getDuration() == null ? other.getDuration() == null : this.getDuration().equals(other.getDuration()))
            && (this.getStartAt() == null ? other.getStartAt() == null : this.getStartAt().equals(other.getStartAt()))
            && (this.getEndAt() == null ? other.getEndAt() == null : this.getEndAt().equals(other.getEndAt()))
            && (this.getCourseId() == null ? other.getCourseId() == null : this.getCourseId().equals(other.getCourseId()))
            && (this.getHourId() == null ? other.getHourId() == null : this.getHourId().equals(other.getHourId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        result = prime * result + ((getDuration() == null) ? 0 : getDuration().hashCode());
        result = prime * result + ((getStartAt() == null) ? 0 : getStartAt().hashCode());
        result = prime * result + ((getEndAt() == null) ? 0 : getEndAt().hashCode());
        result = prime * result + ((getCourseId() == null) ? 0 : getCourseId().hashCode());
        result = prime * result + ((getHourId() == null) ? 0 : getHourId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", duration=").append(duration);
        sb.append(", startAt=").append(startAt);
        sb.append(", endAt=").append(endAt);
        sb.append(", courseId=").append(courseId);
        sb.append(", hourId=").append(hourId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}