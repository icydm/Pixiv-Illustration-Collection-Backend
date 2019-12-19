package dev.cheerfun.pixivic.common.po;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import dev.cheerfun.pixivic.common.po.illust.ArtistPreView;
import dev.cheerfun.pixivic.common.po.illust.ImageUrl;
import dev.cheerfun.pixivic.common.po.illust.Tag;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author OysterQAQ
 * @version 1.0
 * @date 2019/07/28 9:19
 * @description illustration
 */
@Data
public class Illustration {
    @JsonSetter("illust_id")
    private Integer id;
    @JsonSetter("artist_id")
    private Integer artistId;
    private String title;
    private String type;
    private String caption;
    @JsonSetter("artist")
    private ArtistPreView artistPreView;
    private List<Tag> tags;
    @JsonSetter("image_urls")
    @JsonProperty("imageUrls")
    private List<ImageUrl> imageUrls;
    private List<String> tools;
    @JsonSetter("create_date")
    @JsonProperty("createDate")
    private Date createDate;
    @JsonSetter("page_count")
    @JsonProperty("pageCount")
    private Integer pageCount;
    private Integer width;
    private Integer height;
    @JsonSetter("sanity_level")
    @JsonProperty("sanityLevel")
    private Integer sanityLevel;
    private Integer restrict;
    @JsonSetter("x_restrict")
    @JsonProperty("xRestrict")
    private Integer xRestrict;
    @JsonSetter("total_view")
    @JsonProperty("totalView")
    private Integer totalView;
    @JsonSetter("total_bookmarks")
    @JsonProperty("totalBookmarks")
    private Integer totalBookmarks;

    public void setArtistPreView(Integer id, String name, String account, String avatar) {
        this.artistPreView = new ArtistPreView(id, name, account, avatar);
    }
}


