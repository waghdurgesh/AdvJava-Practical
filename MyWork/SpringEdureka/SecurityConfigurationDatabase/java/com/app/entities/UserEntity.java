package com.app.entities;
/*
 * <tr key={employee.id}>
                <td>{employee.firstName}</td>
                <td>{employee.lastName}</td>
                <td>{employee.email}</td>
                <td>{employee.workLocation}</td>
                <td>{employee.department}</td>
                <td>{employee.joinDate}</td>
                <td>{employee.salary}</td>
                <td>
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.*;

//JPA annotations
@Entity
@Table(name = "users")
//Lombok annotations
@NoArgsConstructor // =def arg less ctor
@AllArgsConstructor // all args ctor
@Getter // all getters
@Setter // all setters
//@Data// all getters + setters + hashCode + equals + toString
@ToString(exclude = "password") // toString excluding password
//how to exclude null or blank(default) values during ser ?
//@JsonInclude(Include.NON_DEFAULT)
public class UserEntity extends BaseEntity {
	@Column(length = 20)
	@NotBlank(message = "First Name is required!!!!")
	private String firstName;
	@Column(length = 20)
	private String lastName;
	@Column(length = 30, unique = true)
	private String email;
	@Column(length = 20, nullable = false)
	// How to tell Jackson (i.e a vendor for ser n deserial) to skip the property
	// from ser yet retain during de-ser ?
	@JsonProperty(access = Access.WRITE_ONLY) // only setter will be accessible during conversion
	// Jackson uses : getters : during ser. n setters during de-ser.
	private String password;
	@Enumerated(EnumType.STRING)
	@Column(length = 30)
	private UserRole role;
}
