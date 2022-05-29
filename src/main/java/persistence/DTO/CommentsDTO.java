package persistence.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentsDTO {

    private int commentsNumber;
    private int memberNumber;
    private int foodNum;
    private String content;
    private int likeCount;
    private int hateCount;

    private String memberID;
    private String foodName;

    public CommentsDTO(){}

    public CommentsDTO(int commentsNumber, int memberNumber, int foodNum, String content, int likeCount, int hateCount){
        this.commentsNumber = commentsNumber;
        this.memberNumber = memberNumber;
        this.foodNum = foodNum;
        this.content = content;
        this.likeCount = likeCount;
        this.hateCount = hateCount;
    }

    public String toString(){
        return memberID + " : " + content;
    }

}
