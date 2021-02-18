package com.andrerocha.projeto.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.andrerocha.projeto.builders.AdminBuilder;
import com.andrerocha.projeto.builders.ArticleBuilder;
import com.andrerocha.projeto.builders.UserBuilder;
import com.andrerocha.projeto.entities.Admin;
import com.andrerocha.projeto.entities.Article;
import com.andrerocha.projeto.entities.User;
import com.andrerocha.projeto.repositories.AdminRepository;
import com.andrerocha.projeto.repositories.ArticleRepository;
import com.andrerocha.projeto.repositories.UserRepository;
import com.andrerocha.projeto.services.AdminService;
import com.andrerocha.projeto.services.ArticleService;
import com.andrerocha.projeto.services.UserService;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private AdminRepository adminRepository;
	@Autowired
	private ArticleRepository articleRepository;

	@Override
	public void run(String... args) throws Exception {

		User user = new UserBuilder()
				.setName("Andre Santos Rocha")
				.setEmail("andrerocha546@gmail.com")
				.setPassword("Asdsr11941918")
				.getResult();
		
		Admin admin = new AdminBuilder()
				.setName("Andre Rocha")
				.setEmail("andrerocha546@gmail.com")
				.setPassword("Asdsr11941918")
				.getResult();

		Article article = new ArticleBuilder()
				.setTitle("nao sei aaaa")
				.setImageUrl("https://google.com")
				.setDescription("Lorem Ipsum is simply dummy text of the printing and typesetting")
				.setContent("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.")
//				.setUser(user)
				.getResult();

		articleRepository.save(article);
		userRepository.save(user);
		adminRepository.save(admin);

	}

}
