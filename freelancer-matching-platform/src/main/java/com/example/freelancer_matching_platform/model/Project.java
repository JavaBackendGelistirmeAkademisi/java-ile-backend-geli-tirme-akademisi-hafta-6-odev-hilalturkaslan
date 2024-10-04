package com.example.freelancer_matching_platform.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "projects")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String title;
	private String description;
	private Double budget;

	@ManyToOne
	@JoinColumn(name = "employer_id")
	private User employer;
}





