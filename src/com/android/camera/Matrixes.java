package com.android.camera;

public class Matrixes
{
    public static final float[] G4CCM1;
    public static final float[] G4CCM2;
    public static final float[] G4NM;
    public static final float[] G4_foward_matrix1;
    public static final float[] G4_foward_matrix2;
    public static final float[] G4_identity_matrix1;
    public static final float[] G4_identity_matrix2;
    public static final float[] G4_identity_neutra;
    public static final float[] G4_noise_3x1_matrix;
    public static final float[] G4_reduction_matrix1;
    public static final float[] G4_reduction_matrix2;
    public static final float[] Nex6CCM1;
    public static final float[] Nex6CCM2;
    public static final float[] Nex6NM;
    public static final float[] Nexus6_foward_matrix1;
    public static final float[] Nexus6_foward_matrix2;
    public static final float[] Nexus6_identity_matrix1;
    public static final float[] Nexus6_identity_matrix2;
    public static final float[] Nexus6_identity_neutra;
    public static final float[] Nexus6_noise_3x1_matrix;
    public static final float[] Nexus6_reduction_matrix1;
    public static final float[] Nexus6_reduction_matrix2;
    public static final float[] OnePlus_foward_matrix1;
    public static final float[] OnePlus_foward_matrix2;
    public static final float[] OnePlus_identity_matrix1;
    public static final float[] OnePlus_identity_matrix2;
    public static final float[] OnePlus_identity_neutra;
    public static final float[] OnePlus_noise_3x1_matrix;
    public static final float[] OnePlus_reduction_matrix1;
    public static final float[] OnePlus_reduction_matrix2;
    public static final float[] g3_color1;
    public static final float[] g3_color2;
    public static final float[] g3_neutral;
    public static final float[] m9_color1;
    public static final float[] m9_color2;
    public static final float[] m9_neutral;
    public static final float[] nocal_color1;
    public static final float[] nocal_color2;
    public static final float[] nocal_nutral;
    public static final float[] nubia_color1;
    public static final float[] nubia_color2;
    public static final float[] nubia_neutral;
    public static final float[] onePCCM1;
    public static final float[] onePCCM2;
    public static final float[] onePNM;
    public static final float[] test_matrix1;
    public static final float[] test_matrix2;
    public static final float[] test_neutra;
    
    static {
        g3_color1 = new float[] { 0.9218607f, 0.026396751f, -0.11104965f, -0.33314323f, 1.179348f, 0.12609386f, -0.054322243f, 0.23197842f, 0.2338543f };
        g3_color2 = new float[] { 0.60532856f, 0.01733303f, -0.07291889f, -0.33314323f, 1.179348f, 0.12609386f, -0.085347176f, 0.36446285f, 0.36741066f };
        g3_neutral = new float[] { 0.35664463f, 0.6134014f, 0.3468151f };
        nocal_color1 = new float[] { 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f };
        nocal_color2 = new float[] { 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f };
        nocal_nutral = new float[] { 1.0f, 1.0f, 1.0f };
        m9_color1 = new float[] { 0.6484375f, -0.1171875f, -0.0234375f, -0.2265625f, 0.9765625f, 0.2109375f, 0.0078125f, 0.171875f, 0.46875f };
        m9_color2 = new float[] { 0.96875f, -0.359375f, 0.375f, -0.2578125f, 1.03125f, 0.71875f, 0.015625f, 0.078125f, 0.6875f };
        m9_neutral = new float[] { 0.515625f, 1.0f, 0.671875f };
        nubia_color1 = new float[] { 1.13886f, -0.6577f, -0.1728f, -0.158f, 0.84159f, 0.31641f, 0.0015999996f, 0.11354f, 0.54517f };
        nubia_color2 = new float[] { 0.84004f, -0.19591f, -0.06722f, -0.37852f, 1.17735f, 0.20117f, -0.05178f, 0.20784f, 0.51022f };
        nubia_neutral = new float[] { 0.6076f, 1.0f, 0.4993f };
        test_matrix1 = new float[] { 1.1984f, -0.6921f, -0.1818f, -0.1663f, 0.8856f, 0.333f, 0.0017f, 0.1195f, 0.5737f };
        test_matrix2 = new float[] { 0.8586f, -0.2002f, -0.0687f, -0.3869f, 1.2034f, 0.2056f, -0.0529f, 0.2124f, 0.5215f };
        test_neutra = new float[] { 0.8853463f, 1.0f, 0.5438499f };
        OnePlus_identity_matrix1 = new float[] { 1.13886f, -0.6577f, 0.1728f, -0.158f, 0.84159f, 0.31641f, 0.0016f, 0.11354f, 0.54517f };
        OnePlus_identity_matrix2 = new float[] { 0.84004f, -0.19591f, -0.06722f, -0.37852f, 1.17735f, 0.20117f, -0.05178f, 0.20784f, 0.51022f };
        OnePlus_identity_neutra = new float[] { 0.6295f, 1.0f, 0.5108f };
        OnePlus_foward_matrix1 = new float[] { 0.6648f, 0.2566f, 0.0429f, 0.197f, 0.9994f, -0.1964f, -0.0894f, -0.2304f, 1.145f };
        OnePlus_foward_matrix2 = new float[] { 0.6617f, 0.3849f, -0.0823f, 0.24f, 1.1138f, -0.3538f, -0.0062f, -0.1147f, 0.946f };
        OnePlus_reduction_matrix1 = new float[] { 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f, 1.0f };
        OnePlus_reduction_matrix2 = new float[] { 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f, 1.0f };
        OnePlus_noise_3x1_matrix = new float[] { 0.8853463f, 1.0f, 0.5438499f };
        Nexus6_identity_matrix1 = new float[] { 1.1407f, -0.4022f, -0.234f, -0.4314f, 1.404f, 0.0146f, -0.0439f, 0.2047f, 0.5704f };
        Nexus6_identity_matrix2 = new float[] { 0.7228f, -0.0893f, -0.0975f, -0.4792f, 1.3481f, 0.1381f, -0.1137f, 0.268f, 0.5604f };
        Nexus6_identity_neutra = new float[] { 0.5391f, 1.0f, 0.6641f };
        Nexus6_foward_matrix1 = new float[] { 0.6328f, 0.0469f, 0.2813f, 0.1641f, 0.7578f, 0.0781f, -0.0469f, -0.6406f, 1.5078f };
        Nexus6_foward_matrix2 = new float[] { 0.7578f, 0.0859f, 0.1172f, 0.2734f, 0.8281f, -0.1016f, 0.0156f, -0.2813f, 1.0859f };
        Nexus6_reduction_matrix1 = new float[] { 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f, 1.0f };
        Nexus6_reduction_matrix2 = new float[] { 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f, 1.0f };
        Nexus6_noise_3x1_matrix = new float[] { 0.8853463f, 1.0f, 0.5438499f };
        G4_identity_matrix1 = new float[] { 1.15625f, -0.2890625f, -0.3203125f, -0.53125f, 1.5625f, 0.0625f, -0.078125f, 0.28125f, 0.5625f };
        G4_identity_matrix2 = new float[] { 0.5859375f, 0.0546875f, -0.125f, -0.6484375f, 1.5546875f, 0.0546875f, -0.2421875f, 0.5625f, 0.390625f };
        G4_identity_neutra = new float[] { 0.53125f, 1.0f, 0.640625f };
        G4_foward_matrix1 = new float[] { 0.8203f, -0.2188f, 0.3594f, 0.3438f, 0.5703f, 0.0938f, 0.0156f, -0.7266f, 1.5391f };
        G4_foward_matrix2 = new float[] { 0.6797f, -0.0781f, 0.3594f, 0.2109f, 0.7031f, 0.0859f, -0.0469f, -0.8281f, 1.6953f };
        G4_reduction_matrix1 = new float[] { 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f, 1.0f };
        G4_reduction_matrix2 = new float[] { 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f, 1.0f };
        G4_noise_3x1_matrix = new float[] { 0.8853463f, 1.0f, 0.5438499f };
        onePCCM1 = new float[] { 1.13886f, -0.6577f, 0.1728f, -0.158f, 0.84159f, 0.31641f, 0.0016f, 0.11354f, 0.54517f };
        onePCCM2 = new float[] { 0.84004f, -0.19591f, -0.06722f, -0.37852f, 1.17735f, 0.20117f, -0.05178f, 0.20784f, 0.51022f };
        onePNM = new float[] { 0.6295f, 1.0f, 0.5108f };
        Nex6CCM1 = new float[] { 1.1407f, -0.4022f, -0.234f, -0.4314f, 1.404f, 0.0146f, -0.0439f, 0.2047f, 0.5704f };
        Nex6CCM2 = new float[] { 0.7228f, -0.0893f, -0.0975f, -0.4792f, 1.3481f, 0.1381f, -0.1137f, 0.268f, 0.5604f };
        Nex6NM = new float[] { 0.5391f, 1.0f, 0.6641f };
        G4CCM1 = new float[] { 1.15625f, -0.2890625f, -0.3203125f, -0.53125f, 1.5625f, 0.0625f, -0.078125f, 0.28125f, 0.5625f };
        G4CCM2 = new float[] { 0.5859375f, 0.0546875f, -0.125f, -0.6484375f, 1.5546875f, 0.0546875f, -0.2421875f, 0.5625f, 0.390625f };
        G4NM = new float[] { 0.53125f, 1.0f, 0.640625f };
    }
    
    static class G3Device
    {
        static float[] CC_A;
        static float[] CC_A_FRONT;
        static float[] CC_D65;
        static float[] CC_D65_FRONT;
        static float[] CC_LOWLIGHT;
        static float[] CC_OUTDOOR;
        static float[] CC_TL84;
        static float[] neutral_light_front;
        public static float[] wb_neutral;
        
        static {
            G3Device.wb_neutral = new float[] { 0.567383f, 1.0f, 0.554688f };
            G3Device.CC_TL84 = new float[] { 1.921158f, -1.110443f, 0.189285f, -0.255173f, 1.376129f, -0.120956f, 0.9609375f, -0.851608f, 1.846222f };
            G3Device.CC_LOWLIGHT = new float[] { 1.84596f, -1.02423f, 0.17828f, -0.24259f, 1.41108f, -0.1685f, -1.0654297f, -0.9031f, 1.91504f };
            G3Device.CC_D65 = new float[] { 1.820541f, -1.001724f, 0.181183f, -0.211121f, 1.388733f, -0.177612f, 0.8833008f, -0.841278f, 1.839066f };
            G3Device.CC_A = new float[] { 1.72401f, -0.8574f, 0.13339f, -0.2927f, 1.43779f, -0.14509f, -0.97021484f, -1.17881f, 2.2327f };
            G3Device.CC_OUTDOOR = new float[] { 1.892731f, -0.989472f, 1.4433594f, -0.27655f, 1.601531f, -0.324981f, 0.9863281f, -0.845826f, 1.838852f };
            G3Device.neutral_light_front = new float[] { 0.230904f, 0.20558f, 0.266458f };
            G3Device.CC_D65_FRONT = new float[] { 1.51605f, -0.53394f, 1.1425781f, -0.22262f, 1.415243f, -0.19263f, 1.1601562f, -0.52267f, 1.50258f };
            G3Device.CC_A_FRONT = new float[] { 1.487381f, -0.50428f, 1.1347656f, -0.2105f, 1.392174f, -0.18192f, 1.1513672f, -0.49363f, 1.474659f };
        }
    }
    
    static class HTC_M8Device
    {
        public static float[] CC_A;
        public static float[] CC_D65;
        public static float[] wb_neutral;
        
        static {
            HTC_M8Device.wb_neutral = new float[] { 1.0f, 1.0f, 1.0f };
            HTC_M8Device.CC_A = new float[] { 1.8358f, -0.1674f, -0.6684f, -0.1037f, 0.9417f, 0.162f, -0.0508f, -1.0015f, 1.9507f };
            HTC_M8Device.CC_D65 = new float[] { 1.9644f, -0.8577f, -0.1067f, -0.2656f, 1.4262f, -0.1603f, 0.1106f, -0.5087f, 1.3981f };
        }
    }
    
    static class Redmi_Note
    {
        public static float[] CC_A_Back;
        public static float[] CC_D65_Back;
        public static float[] wb_neutral;
        
        static {
            Redmi_Note.wb_neutral = new float[] { 0.545898f, 1.0f, 0.574219f };
            Redmi_Note.CC_A_Back = new float[] { 1.8487f, -0.0768f, -0.7719f, -0.1401f, 1.1341f, 6.0f, -0.1131f, -1.0296f, 2.1427f };
            Redmi_Note.CC_D65_Back = new float[] { 1.7847f, -0.9236f, 0.1389f, -0.1108f, 1.4247f, -0.3139f, 0.1314f, -0.7718f, 1.6403f };
        }
    }
}
