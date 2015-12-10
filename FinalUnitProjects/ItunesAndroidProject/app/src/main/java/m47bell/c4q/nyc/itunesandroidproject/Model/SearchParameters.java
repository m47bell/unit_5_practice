package m47bell.c4q.nyc.itunesandroidproject.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c4q-marbella on 12/6/15.
 */
public class SearchParameters {

    private List<String> searchResults = new ArrayList<>();
//    private Media


    public List<String> getSearchResults() {
        return searchResults;
    }

    public void setSearchResults(List<String> searchResults) {
        this.searchResults = searchResults;
    }
}
