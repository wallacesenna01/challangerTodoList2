package com.arthurwallace.challangerTodoList;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.arthurwallace.challangerTodoList.entity.Todo;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, properties = "spring.profiles.active=test")

class ChallangerTodoListApplicationTests {

	@Autowired
	private WebTestClient webTestClient;

	@Test
	void testeCreateTodoSucess() {

		var todo = new Todo("todo1","desc todo 1", false,1);

		webTestClient
		.post()
		.uri("/todos")
		.bodyValue(todo)
		.exchange()
		.expectStatus().isOk()  // Ou isCreated()
        .expectBody()
        .jsonPath("$.name").isEqualTo(todo.getName())
        .jsonPath("$.description").isEqualTo(todo.getDescription())
        .jsonPath("$.realized").isEqualTo(todo.getRealized())
        .jsonPath("$.priority").isEqualTo(todo.getPriority());
		

	}

	@Test
	void testeCreateTodoFailure() {

		var todo = new Todo("","",false,1);

		webTestClient
		.post()
		.uri("/todos")
		.bodyValue(todo)
		.exchange()
		.expectStatus().isBadRequest();
		 
	}

}
