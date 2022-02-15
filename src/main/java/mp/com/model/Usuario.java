package mp.com.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "User")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable=false, unique=true)
    private int id;

    @Getter @Setter
    @Column(name="userName", nullable=false, unique=true)
    private String userName;

    @Getter @Setter
    @Column(name="password", nullable=false)
    private String password;

    @Getter @Setter
    @Column(name="lastAccess")
    @Temporal(TemporalType.DATE)
    private Date lastAccess;
}
