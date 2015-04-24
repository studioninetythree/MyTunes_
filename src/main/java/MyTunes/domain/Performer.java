package MyTunes.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Dillan on 4/23/2015.
 */
public interface Performer extends Serializable
{
    String getId();
    String getName();
    String getDescription();
    List<Album> getAlbumList();
}
