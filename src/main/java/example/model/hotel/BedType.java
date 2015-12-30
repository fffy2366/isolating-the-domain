package example.model.hotel;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by feng on 15/12/30.
 */
public class BedType {
    private String type ;

    public String getType(String str) {

        return this.getTypeMap().get(str) ;
    }

    public void setType(String type) {
        this.type = type;
    }

    public HashMap<String, String> getTypeMap() {
        //single  单床  ,double  双床,  big  大床,cir  圆床,sindou  单床/双床,bigdou  大床/双床,bigsing  大床/单床
        HashMap<String,String> typeMap = new HashMap<String,String>() ;
        typeMap.put("single","单床") ;
        typeMap.put("double","双床") ;
        typeMap.put("big","大床") ;
        typeMap.put("cir","圆床") ;
        typeMap.put("sindou","单床/双床") ;
        typeMap.put("bigdou","大床/双床") ;
        typeMap.put("bigsing","大床/单床") ;
        typeMap.put("SZC","三张床") ;
        typeMap.put("DBL+DBL","两大床") ;
        typeMap.put("3SGL","三小床") ;
        typeMap.put("D+S","一大床一小床") ;
        typeMap.put("DBL","一大床") ;
        typeMap.put("TWN","两小床") ;
        typeMap.put("SGL","一小床") ;
        typeMap.put("DBL+2SGL","一大床两小床") ;
        typeMap.put("1DBL+3SGL","一大床三小床") ;
        typeMap.put("2DBL+1SGL","两大床一小床") ;
        typeMap.put("2DBL+2SGL","两大床两小床") ;
        typeMap.put("3DBL","三大床") ;
        typeMap.put("3DBL-5","三大床供五人住") ;
        typeMap.put("3DBL-6","三大床供六人住") ;
        typeMap.put("4SGL","四小床") ;
        typeMap.put("DBL+Mattress-3","一大床加床垫供三人入住") ;
        typeMap.put("DBL+Mattress-4","一大床加床垫供四人入住") ;
        typeMap.put("DBL+Mattress-6","一大床加床垫供六人入住") ;
        typeMap.put("Mattres-1","一床垫") ;
        typeMap.put("Mattres-2"," 两床垫") ;
        typeMap.put("Mattres-4","四床垫") ;
        typeMap.put("SUITE","套房") ;
        typeMap.put("Tatami-1","日式榻榻米供一人入住") ;
        typeMap.put("Tatami-2","日式榻榻米供两人入住") ;
        typeMap.put("Tatami-3","日式榻榻米供三人入住") ;
        typeMap.put("Tatami-4","日式榻榻米供四人入住") ;
        typeMap.put("Tatami-5","日式榻榻米供五人入住") ;
        typeMap.put("Tatami-6","日式榻榻米供六人入住") ;
        typeMap.put("TRP-ROH","三人房不指定床型") ;
        typeMap.put("TWN+Mattress-3","二小床加床垫供三人入住") ;
        typeMap.put("ABF","早餐") ;
        typeMap.put("EBED","加床") ;
        typeMap.put("ROH","不能指定床型") ;
        typeMap.put("ROH(2PAX)","不能指定双人房床型") ;
        typeMap.put("ROH(3PAX)","不能指定三人房床型") ;
        typeMap.put("ROH(4PAX)","不能指定四人房床型") ;
        this.setTypeMap(typeMap);
        return typeMap;
    }

    public void setTypeMap(HashMap<String, String> typeMap) {
        this.typeMap = typeMap;
    }

    private HashMap<String,String> typeMap ;

}
