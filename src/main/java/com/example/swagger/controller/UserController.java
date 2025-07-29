package com.example.swagger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.swagger.DTO.TitleView;
import com.example.swagger.service.TitleService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

	private Map<Long, String> users = new HashMap<>();

	@GetMapping("/{id}")
	public ResponseEntity<String> getUserById(@PathVariable Long id) {
		String user = users.get(id);
		if (user != null) {
			return ResponseEntity.ok(user);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
		}
	}

	@PostMapping
	public ResponseEntity<String> createUser(@RequestBody Map<String, String> payload) {
		Long id = new Random().nextLong();
		String name = payload.get("name");
		users.put(id, name);
		return ResponseEntity.status(HttpStatus.CREATED).body("User created with ID: " + id);
	}

	@Autowired
	private TitleService titleService;

	@GetMapping("/SeasonsList")
	public List<TitleView> getAllseasons() {
		return titleService.getAllseasons();
	}
	

	@PersistenceContext
	private EntityManager entityManager;

	@GetMapping("/db-health")
	public ResponseEntity<String> checkDBConnection() {
		try {
			entityManager.createNativeQuery("SELECT 1").getSingleResult();
			return ResponseEntity.ok("Database connection is OK");
		} catch (Exception e) {
			return ResponseEntity.status(500).body("Database connection failed: " + e.getMessage());
		}
	}

}
