package in.nareshit.raghu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="doctor_tab")
public class Doctor {
	
	@Id
	@Column(name="doc_fn_id",
			nullable = false
			)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="doc_fn_col",
			nullable = false
			)
	private String firstName;
	@Column(name="doc_ln_col",
			nullable = false
			)
	private String lastName;
	@Column(name="doc_mail_col",
			nullable = false
			)
	private String email;
	@Column(name="doc_addr_col",
			nullable = false
			)
	private String address;
	@Column(name="doc_mob_col",
			nullable = false
			)
	private String mobile;
	@Column(name="doc_gen_col",
			nullable = false
			)
	private String gender;
	@Column(name="doc_note_col",
			nullable = false
			)
	private String note;
	
	/*
	 * Photo Upload Local
	 */
	@Column(name="img",
			nullable = false
			)
	private String imgLoc;
	@Column(name="image",
			nullable = false
			)
	private String photos;
	@Transient
	private String photosImagePath;
	
	public String getPhotosImagePath() {
		if (photos == null || id == null) 
			return null;
		else
			return "/user-photos/" + id + "/" + photos;
	
	}
}
