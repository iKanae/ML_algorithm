package test;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.lang.Object;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.common.Weighting;
import org.apache.mahout.cf.taste.impl.common.LongPrimitiveIterator;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.recommender.slopeone.MemoryDiffStorage;
import org.apache.mahout.cf.taste.impl.recommender.slopeone.SlopeOneRecommender;
import org.apache.mahout.cf.taste.impl.similarity.EuclideanDistanceSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.recommender.slopeone.DiffStorage;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;
import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.common.LongPrimitiveIterator;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.recommender.slopeone.MemoryDiffStorage;
import org.apache.mahout.cf.taste.impl.recommender.slopeone.SlopeOneRecommender;
/**
 * Created by aaron on 16-7-3.
 */
public class SlopeOne {
    public static void main(String[] args) throws IOException, TasteException {
        String file = "/home/aaron/workspace/mydata/test.txt";
        DataModel model = new FileDataModel(new File(file));
        DiffStorage diffStorage=new MemoryDiffStorage(model,Weighting.UNWEIGHTED,Long.MAX_VALUE);
        Recommender r=new SlopeOneRecommender(model,Weighting.UNWEIGHTED,Weighting.UNWEIGHTED,diffStorage);
        LongPrimitiveIterator iter = model.getUserIDs();

        while (iter.hasNext()) {
            long uid = iter.nextLong();
            List list = r.recommend(uid,2);
            System.out.printf("uid:%s", uid);
            /*System.out.printf("%s", list);*/
            for(int i=0;i<list.size();i++) {
                System.out.printf("(   %s)", list.get(i));
            }
            System.out.println();
    }
    }
}
