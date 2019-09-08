package be.jkin.kudosusuariosrest.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "kudos_users")
@EntityListeners(AuditingEntityListener.class)
public class User {

    private long id;
    private String nickname;
    private String firstName;
    private String lastName;
    private long totalKudos;
    private Date createdAt;
    private String createdBy;
    private Date updatedAt;
    private String updatedBy;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "first_name", nullable = false)
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name", nullable = false)
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void increaseKudos()
    {
        this.totalKudos++;
    }

    @Column(name = "nickname", nullable = false)
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Column(name = "total_kudos", nullable = false)
    public long getTotalKudos() {
        return totalKudos;
    }
    public void setTotalKudos(long totalKudos) {
        this.totalKudos = totalKudos;
    }

    @Column(name = "created_at", nullable = false)
    @CreatedDate
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Column(name = "created_by", nullable = false)
    @CreatedBy
    public String getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Column(name = "updated_at", nullable = false)
    @LastModifiedDate
    public Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Column(name = "updated_by", nullable = false)
    @LastModifiedBy
    public String getUpdatedby() {
        return updatedBy;
    }
    public void setUpdatedby(String updatedby) {
        this.updatedBy = updatedby;
    }

}
