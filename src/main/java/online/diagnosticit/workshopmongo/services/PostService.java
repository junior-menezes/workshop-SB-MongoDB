package online.diagnosticit.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.diagnosticit.workshopmongo.domain.Post;
import online.diagnosticit.workshopmongo.repository.PostRepository;
import online.diagnosticit.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		 return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado. ID: " + id));
	}
	
	public List<Post> findByTitle(String text){
		return repo.findByTitle(text);
	}

}
