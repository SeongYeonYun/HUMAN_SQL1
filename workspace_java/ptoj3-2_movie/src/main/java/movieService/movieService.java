package movieService;

import java.util.List;

import movieDAO.movieDAO;
import movieDTO.movieDTO;

public class movieService {
    private final movieDAO movieDAO = new movieDAO();

    public int countrows() {
    	return movieDAO.countMovies();
    }
    
    public List<movieDTO> getAllmovies() {
//    	System.out.println("서비스 실행");
        return movieDAO.selectAllmovies();
    }
    
    public int removemovies(movieDTO movieDTO) {
    	return movieDAO.deletemovie(movieDTO);
    	
    }
}
