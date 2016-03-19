package com.android.camera.util;

import android.os.*;

public class DeviceUtils
{
    public static String G2Models;
    public static String G3Models;
    public static String M8Models;
    static String MTK;
    public static String Omap4Devices;
    public static String Yureka;
    private static int lgeadv;
    static String samsung;
    static String xperiaLModels;
    
    static {
        lgeadv = 0;
        Omap4Devices = "Galaxy Nexus,LG-P920,LG-P720,LG-P925,LG-P760,LG-P765,LG-P925,LG-SU760,LG-SU870,Motorola RAZR MAXX,DROID RAZR,DROID 4,GT-I9100G,U9200";
        G2Models = "LG-D800,LG-D801,LG-D802,LG-D803,LG-D804,LG-D805,LG-D820,LG-F320,LG-F320S,LG-F320L,F320K,LG-VS980";
        M8Models = "HTC One_M8, One M8,HTC One M8,htc_m8";
        G3Models = "LG-D855,LGLS990,LG VS985,LG-D851";
        samsung = "SM-G900V,SM-G900,SM-G900H";
        MTK = "P6Life,thl 5000,Philips W8555,MX4";
        xperiaLModels = "C2104";
        Yureka = "YUREKA,AO5510,Yureka,A05510";
    }
    
    public static boolean hasIMX135() {
        final String model = Build.MODEL;
        return model.equals("NX503A") || model.contains("NX501") || model.equals("NX403A") || model.equals("Z5Smini") || model.equals("Z5") || model.contains("NX601");
    }
    
    public static boolean hasIMX214() {
        final String model = Build.MODEL;
        return model.contains("NX505") || model.contains("NX506") || model.contains("NX507") || model.contains("A0001");
    }
    
    public static boolean isAlcatel_Idol3() {
        return Build.MODEL.equals("6045Y");
    }
    
    public static boolean isCamera1DNGSupportedDevice() {
        return isLG_G3() || isG2() || isHTC_M8() || isZTEADV() || isHTC_M9() || isHtc_One_SV() || isHtc_One_XL() || isLenovoK910() || isYureka() || isOnePlusOne() || isRedmiNote() || isXiaomiMI3W() || isXperiaL() || isMeizuMX4() || isTHL5000() || isXiaomiMI_Note_Pro() || isAlcatel_Idol3();
    }
    
    public static boolean isEvo3d() {
        return Build.MODEL.equals("HTC EVO 3D X515m") || Build.MODEL.equals("HTC X515d") || Build.MODEL.equals("HTC ShooterU") || Build.MODEL.equals("HTC Shooter");
    }
    
    public static boolean isExynos() {
        final String model = Build.MODEL;
        return model.equals("GT-I9000") || model.equals("GT-I9100") || model.equals("GT-I9300") || model.equals("GT-I9500") || model.equals("SM-905") || model.equals("GT-N7000") || model.equals("GT-N7100") || model.equals("SM-G900H");
    }
    
    public static boolean isG2() {
        boolean b = Build.DEVICE.equals("g2");
        if (!b) {
            b = G2Models.contains(Build.MODEL);
        }
        return b;
    }
    
    public static boolean isGioneE7() {
        return Build.MODEL.contains("E7");
    }
    
    public static boolean isHTC_M7() {
        return Build.MODEL.equals("HTC One_M7");
    }
    
    public static boolean isHTC_M8() {
        boolean equals = Build.DEVICE.equals("htc_m8");
        if (!equals) {
            if (Build.MODEL.equals("HTC One_M8") || Build.MODEL.equals("One M8") || Build.MODEL.equals("HTC One M8") || Build.MODEL.equals("htc_m8") || Build.MODEL.equals("831C")) {
                return true;
            }
            equals = false;
        }
        return equals;
    }
    
    public static boolean isHTC_M9() {
        final String model = Build.MODEL;
        return model.equals("HTC One_M9") || model.equals("HTC One M9");
    }
    
    public static boolean isHtc_One_SV() {
        return Build.MODEL.contains("HTC One SV");
    }
    
    public static boolean isHtc_One_XL() {
        return Build.MODEL.toLowerCase().contains("one xl");
    }
    
    public static boolean isLG_G3() {
        boolean b = Build.DEVICE.equals("g3");
        if (!b) {
            b = G3Models.contains(Build.MODEL);
        }
        return b;
    }
    
    public static boolean isLenovoK910() {
        return Build.MODEL.contains("Lenovo K910");
    }
    
    public static boolean isMediaTekDevice() {
        return MTK.contains(Build.MODEL);
    }
    
    public static boolean isMeizuMX4() {
        return Build.MODEL.equals("MX4");
    }
    
    public static boolean isO3d() {
        final String model = Build.MODEL;
        return model.equals("LG-P920") || model.equals("LG-P720") || model.equals("LG-P925") || model.equals("LG-P925") || model.equals("LG-SU760") || model.equals("LG-SU870");
    }
    
    public static boolean isOmap() {
        return Omap4Devices.contains(Build.MODEL);
    }
    
    public static boolean isOnePlusOne() {
        return Build.MODEL.equals("A0001");
    }
    
    public static boolean isQualcomm() {
        final String model = Build.MODEL;
        return model.equals("LG-D800") || isEvo3d() || model.equals("LG-D802") || model.equals("LG-D803") || model.equals("LG-D820") || model.equals("LG-D821") || model.equals("LG-D801") || model.equals("C6902") || model.equals("C6903") || model.equals("C833") || model.equals("LG803") || model.equals("C6602") || model.equals("C6603") || model.equals("Nexus 4") || model.equals("Nexus 5") || model.equals("SM-N9005") || model.equals("GT-I9505") || model.equals("GT-I9506") || model.equals("LG803") || model.equals("HTC One") || model.equals("LG-F320") || model.equals("LG-F320S") || model.equals("LG-F320K") || model.equals("LG-F320L") || model.equals("LG-VS980") || model.equals("HTC One_M8") || model.equals("NX503A") || model.equals("Z5S");
    }
    
    public static boolean isRedmiNote() {
        return Build.MODEL.equals("HM NOTE 1LTE");
    }
    
    public static boolean isSamsungADV() {
        return samsung.contains(Build.MODEL);
    }
    
    public static boolean isSonyADV() {
        final String model = Build.MODEL;
        return model.contains("C66") || model.contains("C69") || model.contains("C65") || model.contains("C64") || model.contains("D65") || model.contains("D66");
    }
    
    public static boolean isTHL5000() {
        return Build.MODEL.equals("thl 5000");
    }
    
    public static boolean isTablet() {
        final String model = Build.MODEL;
        return model.equals("Nexus 7") || model.equals("Nexus 10");
    }
    
    public static boolean isTegra() {
        final String model = Build.MODEL;
        return model.equals("Nexus 7") || model.equals("LG-P880") || model.equals("ZTE-Mimosa X") || model.equals("HTC One X") || model.equals("HTC One X+") || model.equals("LG-P990") || model.equals("EPAD") || model.equals("GT-P7500") || model.equals("GT-P7300");
    }
    
    public static boolean isXiaomiADV() {
        final String model = Build.MODEL;
        return model.equals("Aries") || model.equals("cNexus 10");
    }
    
    public static boolean isXiaomiMI3W() {
        return Build.MODEL.equals("MI 3W");
    }
    
    public static boolean isXiaomiMI_Note_Pro() {
        return Build.MODEL.equals("MI NOTE Pro");
    }
    
    public static boolean isXperiaL() {
        return xperiaLModels.contains(Build.MODEL);
    }
    
    public static boolean isYureka() {
        boolean b = Build.DEVICE.equals("YUREKA");
        if (!b) {
            b = Yureka.contains(Build.MODEL);
        }
        return b;
    }
    
    public static boolean isZTEADV() {
        final String model = Build.MODEL;
        return model.equals("NX503A") || model.contains("NX") || model.equals("NX403A") || model.contains("Z5s") || model.equals("Z5") || model.contains("NX505") || model.contains("NX506") || model.contains("NX507");
    }
}
