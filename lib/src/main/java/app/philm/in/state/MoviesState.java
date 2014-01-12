package app.philm.in.state;

import com.uwetrottmann.tmdb.entities.Configuration;

import java.util.List;
import java.util.Map;
import java.util.Set;

import app.philm.in.controllers.MovieController;
import app.philm.in.model.PhilmMovie;
import app.philm.in.model.SearchResult;

public interface MoviesState extends BaseState {

    public Map<String, PhilmMovie> getTmdbIdMovies();

    public Map<String, PhilmMovie> getImdbIdMovies();

    public List<PhilmMovie> getLibrary();

    public void setLibrary(List<PhilmMovie> library);

    public List<PhilmMovie> getTrending();

    public void setTrending(List<PhilmMovie> trending);

    public MoviePaginatedResult getPopular();

    public void setPopular(MoviePaginatedResult popular);

    public MoviePaginatedResult getNowPlaying();

    public void setNowPlaying(MoviePaginatedResult nowPlaying);

    public List<PhilmMovie> getWatchlist();

    public void setWatchlist(List<PhilmMovie> watchlist);

    public void setSearchResult(SearchResult result);

    public SearchResult getSearchResult();

    public Set<MovieController.Filter> getFilters();

    public Configuration getTmdbConfiguration();

    public void setTmdbConfiguration(Configuration configuration);

    public static class LibraryChangedEvent {}

    public static class PopularChangedEvent {}

    public static class InTheatresChangedEvent {}

    public static class TrendingChangedEvent {}

    public static class WatchlistChangedEvent {}

    public static class SearchResultChangedEvent {}

    public static class TmdbConfigurationChangedEvent {}

    public class MoviePaginatedResult extends PaginatedResult<List<PhilmMovie>> {
    }

}