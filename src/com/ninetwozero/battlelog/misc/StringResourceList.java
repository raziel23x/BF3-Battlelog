/*
    This file is part of BF3 Battlelog

    BF3 Battlelog is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    BF3 Battlelog is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.
 */

package com.ninetwozero.battlelog.misc;

import java.util.HashMap;

import com.ninetwozero.battlelog.R;


public class StringResourceList {

    //Attributes
    private static HashMap<String, Integer> weapons; //<GUID, resId>
    private static HashMap<String, Integer> attachments; //<GUID, resId>
    private static HashMap<String, Integer> vehicles; //<GUID, resId>
    private static HashMap<String, Integer> vehicleUpgrades; //<GUID, resId>
    private static HashMap<String, Integer> kits; //<GUID, resId>
    private static HashMap<String, Integer> awards; //<GUID, resId>
    private static HashMap<String, Integer> skills; //<GUID, resId>
    private static HashMap<String, Integer> dogtags; //<GUID, resId>
    
    // Construct = none
    private StringResourceList() {}
 
    static {

        //Let's init
        weapons = new HashMap<String, Integer>();
        attachments = new HashMap<String, Integer>();
        vehicles = new HashMap<String, Integer>();
        vehicleUpgrades = new HashMap<String, Integer>();
        kits = new HashMap<String, Integer>();
        awards = new HashMap<String, Integer>();
        skills = new HashMap<String, Integer>();
        dogtags = new HashMap<String, Integer>();
        
        //Fill 'em up
        weapons.put("75D1FFC8-D442-4212-B668-96AED9030FC6", R.string.desc_w_rpk);
        weapons.put("DC356150-2A5F-4FCA-BE6C-B993EE7F8A8B", R.string.desc_w_javelin);
        weapons.put("CB018ADD-3648-4504-9359-9BAFB8D92F7D", R.string.desc_w_mk11);
        weapons.put("A9F5B1F6-D83E-4BD8-AFE8-08C4B0A3E697", R.string.desc_w_svd);
        weapons.put("CB651B07-2CE4-4527-B1AC-2AEB6D04CBF5", R.string.desc_w_sks);
        weapons.put("F0B12FF6-7D20-4E49-8F19-EF5F1E9CBA6D", R.string.desc_w_m39);
        weapons.put("EB17660D-D81B-4BB7-BE95-70662855489E", R.string.desc_w_m39);
        weapons.put("3F06931A-443C-6E78-DEF9-A33EB9F43D35", R.string.desc_w_pecheng);
        weapons.put("3A6B6A16-E5A1-33E0-5B53-56E77833DAF4", R.string.desc_w_m416);
        weapons.put("5244385C-B7ED-4266-AB7C-C1C1B222A9CD", R.string.desc_w_m4);
        weapons.put("42DB9F03-0224-4676-99FC-ED444E356290", R.string.desc_w_m16a4);
        weapons.put("1E5E0296-CFD0-448E-B1D7-F795E8F98E2C", R.string.desc_w_g36c);
        weapons.put("38C20C39-EE43-489F-AE95-DF0519F72409", R.string.desc_w_m412rex);
        weapons.put("9351DDBF-795A-4BC6-84D7-37B537E3D049", R.string.desc_w_sv98);
        weapons.put("A4F108EB-1FA2-4C94-93FE-357B1D7EBF4A", R.string.desc_w_aks74u);
        weapons.put("08F58ECD-BC99-48AA-A9B3-47D412E99A4E", R.string.desc_w_rpg7);
        weapons.put("96FC0A67-DEA2-4061-B955-E173A8DBB00D", R.string.desc_w_saiga12);
        weapons.put("04FD6527-0BF0-4A67-9ABB-9F992BF2CBA0", R.string.desc_w_glock17);
        weapons.put("65D4A9F9-0ACD-46FD-9AE2-3E9670DD22FB", R.string.desc_w_an94);
        weapons.put("1C689273-7637-40FF-89A5-E75F120D9E02", R.string.desc_w_m27);
        weapons.put("4F90708E-6875-4A5E-B685-CAF310A0BA95", R.string.desc_w_m1911lit);
        weapons.put("386F9329-7DE7-6FB9-1366-2877C698D9B7", R.string.desc_w_scarh);
        weapons.put("655D5E41-6DB8-4F3C-9F2A-8117AE11699C", R.string.desc_w_mk11);
        weapons.put("AC994B66-DA51-42FB-A234-FCBA33EB9AB7", R.string.desc_w_glock18silenced);
        weapons.put("2A267103-14F2-4255-B0D4-819139A4E202", R.string.desc_w_ump45);
        weapons.put("F3EF48EB-37C3-4F5E-A2ED-ACE7E4D419DD", R.string.desc_w_pdr);
        weapons.put("05EB2892-8B51-488E-8956-4350C3D2BA27", R.string.desc_w_m98b);
        weapons.put("A4F683C2-40E2-464C-AE85-AFE4462F2D40", R.string.desc_w_m9silenced);
        weapons.put("07A6AB6A-457D-4481-94F9-A3FE15C3D923", R.string.desc_w_mp443silenced);
        weapons.put("6F741867-AE83-CC7D-BFB1-035452D7A5B4", R.string.desc_w_usas12);
        weapons.put("4D06B1BF-8002-44E2-851E-EAAC8C4FDD1A", R.string.desc_w_taurus44);
        weapons.put("A76BB99E-ABFE-48E9-9972-5D87E5365DAB", R.string.desc_w_m1911);
        weapons.put("5E2D49D1-D1BB-F553-78A5-8D537C43E624", R.string.desc_w_aek971);
        weapons.put("405F32BB-3E1A-4201-B96D-10B231D91BA5", R.string.desc_w_m60);
        weapons.put("F3DF4C76-FD8F-0F11-3B8C-8B9C756EF089", R.string.desc_w_m1014);
        weapons.put("A7278B05-8D76-4A40-B65D-4414490F6886", R.string.desc_w_m16a4);
        weapons.put("512819DB-3E82-33B7-F1D5-E612C9A396BF", R.string.desc_w_g3);
        weapons.put("1EA227D8-2EB5-A63B-52FF-BBA9CFE34AD8", R.string.desc_w_taurus44);
        weapons.put("120A0838-9E95-4564-A6F6-5A14A1E0AF85", R.string.desc_w_aks74u);
        weapons.put("AEFD4BF4-4C08-4834-9DFF-1F7C529175AF", R.string.desc_w_glock17silenced);
        weapons.put("283C66DE-3866-46CD-A1C0-B456A5916537", R.string.desc_w_40mm);
        weapons.put("DB364A96-08FB-4C6E-856B-BD9749AE0A92", R.string.desc_w_glock18);
        weapons.put("69A28562-5569-4D76-82FB-98C4047306F1", R.string.desc_w_m4a1);
        weapons.put("A0222E93-0887-4FC4-90D4-51838945343E", R.string.desc_w_m93r);
        weapons.put("DB94F5EC-74D5-4DB2-9A15-E0C4154BFFD4", R.string.desc_w_f2000);
        weapons.put("1C426722-C0B6-492F-98B2-3B9D2B97C808", R.string.desc_w_m1911silenced);
        weapons.put("E43287AB-529D-4803-B585-6C17E2DD6AEB", R.string.desc_w_mp443lit);
        weapons.put("6F3993B9-E8B2-412F-9361-341140FCBF79", R.string.desc_w_taurus44scoped);
        weapons.put("A607E88D-90B0-4ECD-B892-8BF66AEF90ED", R.string.desc_w_rpk);
        weapons.put("3BA55147-6619-4697-8E2B-AC6B1D183C0E", R.string.desc_w_ak74m);
        weapons.put("AEAA518B-9253-40C2-AA18-A11F8F2D474C", R.string.desc_w_m249);
        weapons.put("C79AAC6E-566E-40E1-B373-3B0029530393", R.string.desc_w_a91);
        weapons.put("21A80B6B-8FA6-4BCC-84D3-7ED782E978FA", R.string.desc_w_asval);
        weapons.put("C12E6868-FC08-4E25-8AD0-1C51201EA69B", R.string.desc_w_p90);
        weapons.put("A8C7508A-F43B-4446-ACCE-F350EDFEDB28", R.string.desc_w_m93r);
        weapons.put("27F63AEA-DD70-4929-9B08-5FF8F075B75E", R.string.desc_w_dao12);
        weapons.put("93CC5226-4381-7458-509E-B2D6F4498164", R.string.desc_w_m40a5);
        weapons.put("6921F5C9-3487-43E6-86F5-296DA097FFFB", R.string.desc_w_m16);
        weapons.put("D4FF4D2C-361F-491E-B53D-207CF77FA609", R.string.desc_w_m9lit);
        weapons.put("50849B49-F3DA-4C92-9830-D4A2932BC9E7", R.string.desc_w_pp2000);
        weapons.put("04C8604E-37DE-4B51-B70A-66468003D604", R.string.desc_w_mp7);
        weapons.put("84B78F21-217A-4A46-A06E-34A90637BAC8", R.string.desc_w_ak74m);
        weapons.put("B2DEF86D-A127-769E-23ED-C9F47F29FAD3", R.string.desc_w_m26mass);
        weapons.put("71B0A1D6-9E4F-40A3-9906-1A7F3AAD573A", R.string.desc_w_mp443);
        weapons.put("07A4C87A-D325-4A73-8C5A-C001ACD13334", R.string.desc_w_870);
        weapons.put("32B899E5-0542-45E6-A34B-86871C7FE098", R.string.desc_w_m27);
        weapons.put("0733BF61-8EBC-4666-9610-7E27D7313791", R.string.desc_w_553);
        weapons.put("D0E124FB-7116-4FBB-AF00-D8994AEB548D", R.string.desc_w_type88);
        weapons.put("35796A7B-C7FA-4C0F-AD99-3DDB3B60A293", R.string.desc_w_igla);
        weapons.put("8963F500-E71D-41FC-4B24-AE17D18D8C73", R.string.desc_w_knife);
        weapons.put("414C4598-4089-43E0-82FB-BBF7031D02E8", R.string.desc_w_m240);
        weapons.put("FEFBA819-898F-4B66-8596-B6576FA9B28A", R.string.desc_w_svd);
        weapons.put("0E0E4701-359B-48FF-B91A-F4B6373435E4", R.string.desc_w_kh2002);
        weapons.put("9B3AF503-2018-4BC9-893F-CD393D3BAD77", R.string.desc_w_m1911tactical);
        weapons.put("E9BEDD8F-899F-3A3C-C561-5E58B350C60D", R.string.desc_w_stinger);
        weapons.put("B145A444-BC4D-48BF-806A-0CEFA0EC231B", R.string.desc_w_m9);
        weapons.put("B1575807-C480-7286-719C-EE2520292A79", R.string.desc_w_m4a1);
        weapons.put("BFAC29DB-5193-4E69-96D9-37D4124C44C2", R.string.desc_w_smaw);


        
        //Set up the vehicles
        vehicles.put("89BEA1D6-2FF4-11DE-8C23-DAB1D69416DE", R.string.desc_v_mi28);
        vehicles.put("C645317B-45BB-E082-7E5C-918388C22D59", R.string.desc_v_pantsir);
        vehicles.put("98E5B9BF-0B68-4AF0-A20D-1A23D6B6BF8B", R.string.desc_v_vodnik);
        vehicles.put("D780AFF6-38B7-11DE-BF1C-984D9AEE762C", R.string.desc_v_z11);
        vehicles.put("60106975-DD7D-11DD-A030-B04E425BA11E", R.string.desc_v_t90);
        vehicles.put("860157CA-6527-4123-B60E-71117DD878D7", R.string.desc_v_lavad);
        vehicles.put("E7A99B55-B5BD-C101-2384-97458D4AC23C", R.string.desc_v_growler);
        vehicles.put("F1FFAE42-B67A-4E4F-2626-3CBF37AE287B", R.string.desc_v_su35);
        vehicles.put("CD8C281F-579D-4E7B-BE3D-F206E91407F8", R.string.desc_v_su39);
        vehicles.put("D35CA587-79AF-D351-6F65-967794C7F1B7", R.string.desc_v_centurion);
        vehicles.put("B26FD546-2ADF-1A90-3044-F7748B86DA26", R.string.desc_v_rib);
        vehicles.put("A676D498-A524-42AD-BE78-72B071D8CD6A", R.string.desc_v_ah1z);
        vehicles.put("B3E9860F-EE10-44F3-B4DC-5730BE251159", R.string.desc_v_a10);
        vehicles.put("D7BAB9C1-1208-4923-BD3A-56EB945E04E1", R.string.desc_v_kornet);
        vehicles.put("C81F8757-E6D2-DF2D-1CFE-B72B4F74FE98", R.string.desc_v_f18);
        vehicles.put("0E09B2D0-BA4A-1509-E1D2-949FB0C04DBE", R.string.desc_v_uh1y);
        vehicles.put("B06A08AB-EECF-11DD-8117-9421284A74E5", R.string.desc_v_m1abrams);
        vehicles.put("37A53096-BA80-5498-1347-8C7B238680C8", R.string.desc_v_tow);
        vehicles.put("B9BAE0F8-72B9-4E1C-B5AD-F9353727C990", R.string.desc_v_ka60);
        vehicles.put("ADF563C9-28B1-C42B-993E-B2FD40F36078", R.string.desc_v_lav25);
        vehicles.put("D68E417F-6103-5140-3ABC-4C7505160A09", R.string.desc_v_vdv);
        vehicles.put("D1B516CA-6119-F025-C923-1B0700B6AEBA", R.string.desc_v_humvee);
        vehicles.put("1E8653E6-11A0-DF93-C808-E48351D2F578", R.string.desc_v_aav);
        vehicles.put("FD8AB748-FF4D-11DD-A7B1-F7C6DEEC9D32", R.string.desc_v_ah6);
        vehicles.put("AAE95907-AFD4-11DD-84FB-9FA71F68ED5E", R.string.desc_v_bmp2);
        vehicles.put("A36C9712-54B3-A5FF-8627-7BC7EFA0C668", R.string.desc_v_9k22);
        vehicles.put("19B63F53-5FD5-4A82-9EF8-B43A2243E9D9", R.string.desc_v_centurion);

        //Vehicle upgrades
        vehicleUpgrades.put("ID_P_VUDESC_MBTCANISTER", R.string.desc_vu_mbtcanister);
        vehicleUpgrades.put("ID_P_VUDESC_PILOT_NOPASSIVE", R.string.desc_vu_pilot_nopassive);
        vehicleUpgrades.put("ID_P_VUDESC_AAARADAR", R.string.desc_vu_aaaradar);
        vehicleUpgrades.put("ID_P_VUDESC_JETAA", R.string.desc_vu_jetaa);
        vehicleUpgrades.put("ID_P_VUDESC_AAENVG", R.string.desc_vu_aaenvg);
        vehicleUpgrades.put("ID_P_VUDESC_JETFIREEX", R.string.desc_vu_jetfireex);
        vehicleUpgrades.put("ID_P_VUDESC_AASMOKE", R.string.desc_vu_aasmoke);
        vehicleUpgrades.put("ID_P_VUDESC_SHFIREEX", R.string.desc_vu_shfireex);
        vehicleUpgrades.put("ID_P_VUDESC_AAARMOR", R.string.desc_vu_aaarmor);
        vehicleUpgrades.put("ID_P_VUDESC_SHFLARE", R.string.desc_vu_shflare);
        vehicleUpgrades.put("ID_P_VUDESC_AASTEALTH", R.string.desc_vu_aastealth);
        vehicleUpgrades.put("ID_P_VUDESC_SHARADAR", R.string.desc_vu_sharadar);
        vehicleUpgrades.put("ID_P_VUDESC_AHWPNEFF", R.string.desc_vu_ahwpneff);
        vehicleUpgrades.put("ID_P_VUDESC_AHZOOM", R.string.desc_vu_ahzoom);
        vehicleUpgrades.put("ID_P_VUDESC_GUNNER_NOPASSIVE", R.string.desc_vu_gunner_nopassive);
        vehicleUpgrades.put("ID_P_VUDESC_IFVENVG", R.string.desc_vu_ifvenvg);
        vehicleUpgrades.put("ID_P_VUDESC_GUNNER_NOACTIVE", R.string.desc_vu_gunner_noactive);
        vehicleUpgrades.put("ID_P_VUDESC_SHLASER", R.string.desc_vu_shlaser);
        vehicleUpgrades.put("ID_P_VUDESC_SHWPNEFF", R.string.desc_vu_shwpneff);
        vehicleUpgrades.put("ID_P_VUDESC_AHTVG", R.string.desc_vu_ahtvg);
        vehicleUpgrades.put("ID_P_VUDESC_AAPREVENT", R.string.desc_vu_aaprevent);
        vehicleUpgrades.put("ID_P_VUDESC_IFVZOOM", R.string.desc_vu_ifvzoom);
        vehicleUpgrades.put("ID_P_VUDESC_AHECM", R.string.desc_vu_ahecm);
        vehicleUpgrades.put("ID_P_VUDESC_MBTSMOKE", R.string.desc_vu_mbtsmoke);
        vehicleUpgrades.put("ID_P_VUDESC_AAAA", R.string.desc_vu_aaaa);
        vehicleUpgrades.put("ID_P_VUDESC_IFVSTEALTH", R.string.desc_vu_ifvstealth);
        vehicleUpgrades.put("ID_P_VUDESC_SHAA", R.string.desc_vu_shaa);
        vehicleUpgrades.put("ID_P_VUDESC_MBTPREVENT", R.string.desc_vu_mbtprevent);
        vehicleUpgrades.put("ID_P_VUDESC_AHGHELL", R.string.desc_vu_ahghell);
        vehicleUpgrades.put("ID_P_VUDESC_MBTWPNEFF", R.string.desc_vu_mbtwpneff);
        vehicleUpgrades.put("ID_P_VUDESC_SHHELL", R.string.desc_vu_shhell);
        vehicleUpgrades.put("ID_P_VUDESC_AAPROX", R.string.desc_vu_aaprox);
        vehicleUpgrades.put("ID_P_VUDESC_JETWPNEFF", R.string.desc_vu_jetwpneff);
        vehicleUpgrades.put("ID_P_VUDESC_IFVAPFSDS", R.string.desc_vu_ifvapfsds);
        vehicleUpgrades.put("ID_P_VUDESC_MBTPROX", R.string.desc_vu_mbtprox);
        vehicleUpgrades.put("ID_P_VUDESC_JETECM", R.string.desc_vu_jetecm);
        vehicleUpgrades.put("ID_P_VUDESC_PILOT_NOSTANCE", R.string.desc_vu_pilot_nostance);
        vehicleUpgrades.put("ID_P_VUDESC_IFVARMOR", R.string.desc_vu_ifvarmor);
        vehicleUpgrades.put("ID_P_VUDESC_AHPROX", R.string.desc_vu_ahprox);
        vehicleUpgrades.put("ID_P_VUDESC_IFVPREVENT", R.string.desc_vu_ifvprevent);
        vehicleUpgrades.put("ID_P_VUDESC_SHPREV", R.string.desc_vu_shprev);
        vehicleUpgrades.put("ID_P_VUDESC_IFVPROX", R.string.desc_vu_ifvprox);
        vehicleUpgrades.put("ID_P_VUDESC_AHLASER", R.string.desc_vu_ahlaser);
        vehicleUpgrades.put("ID_P_VUDESC_SHPROX", R.string.desc_vu_shprox);
        vehicleUpgrades.put("ID_P_VUDESC_AHFLARE", R.string.desc_vu_ahflare);
        vehicleUpgrades.put("ID_P_VUDESC_AAWPNEFF", R.string.desc_vu_aawpneff);
        vehicleUpgrades.put("ID_P_VUDESC_SHBRADAR", R.string.desc_vu_shbradar);
        vehicleUpgrades.put("ID_P_VUDESC_MBTENVG", R.string.desc_vu_mbtenvg);
        vehicleUpgrades.put("ID_P_VUDESC_IFVCOAX", R.string.desc_vu_ifvcoax);
        vehicleUpgrades.put("ID_P_VUDESC_JETFLARE", R.string.desc_vu_jetflare);
        vehicleUpgrades.put("ID_P_VUDESC_SHECM", R.string.desc_vu_shecm);
        vehicleUpgrades.put("ID_P_VUDESC_NOACTIVE", R.string.desc_vu_noactive);
        vehicleUpgrades.put("ID_P_VUDESC_MBTCITV", R.string.desc_vu_mbtcitv);
        vehicleUpgrades.put("ID_P_VUDESC_IFVAT", R.string.desc_vu_ifvat);
        vehicleUpgrades.put("ID_P_VUDESC_AHFIREEX", R.string.desc_vu_ahfireex);
        vehicleUpgrades.put("ID_P_VUDESC_GUNNER_NOSTANCE", R.string.desc_vu_gunner_nostance);
        vehicleUpgrades.put("ID_P_VUDESC_JETMAVER", R.string.desc_vu_jetmaver);
        vehicleUpgrades.put("ID_P_VUDESC_PILOT_NOACTIVE", R.string.desc_vu_pilot_noactive);
        vehicleUpgrades.put("ID_P_VUDESC_JETAVIONIC", R.string.desc_vu_jetavionic);
        vehicleUpgrades.put("ID_P_VUDESC_AHBRADAR", R.string.desc_vu_ahbradar);
        vehicleUpgrades.put("ID_P_VUDESC_NOSTANCE", R.string.desc_vu_nostance);
        vehicleUpgrades.put("ID_P_VUDESC_AAZOOM", R.string.desc_vu_aazoom);
        vehicleUpgrades.put("ID_P_VUDESC_IFVSMOKE", R.string.desc_vu_ifvsmoke);
        vehicleUpgrades.put("ID_P_VUDESC_JETEROCKET", R.string.desc_vu_jeterocket);
        vehicleUpgrades.put("ID_P_VUDESC_MBTZOOM", R.string.desc_vu_mbtzoom);
        vehicleUpgrades.put("ID_P_VUDESC_JETPREV", R.string.desc_vu_jetprev);
        vehicleUpgrades.put("ID_P_VUDESC_SHSTEALTH", R.string.desc_vu_shstealth);
        vehicleUpgrades.put("ID_P_VUDESC_JETPROX", R.string.desc_vu_jetprox);
        vehicleUpgrades.put("ID_P_VUDESC_AHGUIDE", R.string.desc_vu_ahguide);
        vehicleUpgrades.put("ID_P_VUDESC_JETARADAR", R.string.desc_vu_jetaradar);
        vehicleUpgrades.put("ID_P_VUDESC_MBTARMOR", R.string.desc_vu_mbtarmor);
        vehicleUpgrades.put("ID_P_VUDESC_IFVHELL", R.string.desc_vu_ifvhell);
        vehicleUpgrades.put("ID_P_VUDESC_MBTATGM", R.string.desc_vu_mbtatgm);
        vehicleUpgrades.put("ID_P_VUDESC_NOPASSIVE", R.string.desc_vu_nopassive);
        vehicleUpgrades.put("ID_P_VUDESC_JETBRADAR", R.string.desc_vu_jetbradar);
        vehicleUpgrades.put("ID_P_VUDESC_AHAA", R.string.desc_vu_ahaa);
        vehicleUpgrades.put("ID_P_VUDESC_AHPREV", R.string.desc_vu_ahprev);
        vehicleUpgrades.put("ID_P_VUDESC_AHENVG", R.string.desc_vu_ahenvg);
        vehicleUpgrades.put("ID_P_VUDESC_MBTHMG", R.string.desc_vu_mbthmg);
        vehicleUpgrades.put("ID_P_VUDESC_AHSTEALTH", R.string.desc_vu_ahstealth);
        vehicleUpgrades.put("ID_P_VUDESC_IFVWPNEFF", R.string.desc_vu_ifvwpneff);
        vehicleUpgrades.put("ID_P_VUDESC_AHARADAR", R.string.desc_vu_aharadar);
        vehicleUpgrades.put("ID_P_VUDESC_JETSTEALTH", R.string.desc_vu_jetstealth);
        vehicleUpgrades.put("ID_P_VUDESC_MBTCOAX", R.string.desc_vu_mbtcoax);
        vehicleUpgrades.put("ID_P_VUDESC_MBTSTEALTH", R.string.desc_vu_mbtstealth);

        //Attachments
        attachments.put("ID_P_ADESC_LIGHT", R.string.desc_a_light);
        attachments.put("ID_P_ADESC_BOLT", R.string.desc_a_bolt);
        attachments.put("ID_P_ADESC_RX01", R.string.desc_a_rx01);
        attachments.put("ID_P_ADESC_EOTECH", R.string.desc_a_eotech);
        attachments.put("ID_P_ADESC_M145", R.string.desc_a_m145);
        attachments.put("ID_P_ADESC_FRAG", R.string.desc_a_frag);
        attachments.put("ID_P_ADESC_SGA_FRAG", R.string.desc_a_sga_frag);
        attachments.put("ID_P_ADESC_BUCK", R.string.desc_a_buck);
        attachments.put("ID_P_ADESC_SGA_SLUG", R.string.desc_a_sga_slug);
        attachments.put("ID_P_ADESC_LASER", R.string.desc_a_laser);
        attachments.put("ID_P_ADESC_SILENCER", R.string.desc_a_silencer);
        attachments.put("ID_P_ADESC_MAG", R.string.desc_a_mag);
        attachments.put("ID_P_ADESC_LA_SMK", R.string.desc_a_la_smk);
        attachments.put("ID_P_ADESC_BALL", R.string.desc_a_ball);
        attachments.put("ID_P_ADESC_RIFLE", R.string.desc_a_rifle);
        attachments.put("ID_P_ADESC_NOSECONDARY", R.string.desc_a_nosecondary);
        attachments.put("ID_P_ADESC_ACOG", R.string.desc_a_acog);
        attachments.put("ID_P_ADESC_KOBRA", R.string.desc_a_kobra);
        attachments.put("ID_P_ADESC_BIPOD", R.string.desc_a_bipod);
        attachments.put("ID_P_ADESC_SNIPERRIFLE", R.string.desc_a_sniperrifle);
        attachments.put("ID_P_ADESC_SGA_BUCK", R.string.desc_a_sga_buck);
        attachments.put("ID_P_ADESC_PKA", R.string.desc_a_pka);
        attachments.put("ID_P_ADESC_PKS", R.string.desc_a_pks);
        attachments.put("ID_P_ADESC_FLECHETTE", R.string.desc_a_flechette);
        attachments.put("ID_P_ADESC_SLUG", R.string.desc_a_slug);
        attachments.put("ID_P_ADESC_FOREGRIP", R.string.desc_a_foregrip);
        attachments.put("ID_P_ADESC_NOPRIMARYRAIL", R.string.desc_a_noprimaryrail);
        attachments.put("ID_P_ADESC_PKAS", R.string.desc_a_pkas);
        attachments.put("ID_P_ADESC_LA_HE", R.string.desc_a_la_he);
        attachments.put("ID_P_ADESC_LA_SG", R.string.desc_a_la_sg);
        attachments.put("ID_P_ADESC_NOOPTIC", R.string.desc_a_nooptic);
        attachments.put("ID_P_ADESC_NOPRIMARY", R.string.desc_a_noprimary);
        attachments.put("ID_P_ADESC_PSO", R.string.desc_a_pso);
        attachments.put("ID_P_ADESC_SGA_FLECH", R.string.desc_a_sga_flech);
        attachments.put("ID_P_ADESC_IRNV", R.string.desc_a_irnv);
        attachments.put("ID_P_ADESC_BARREL", R.string.desc_a_barrel);
        attachments.put("ID_P_ADESC_SUPPRESS", R.string.desc_a_suppress);
        attachments.put("ID_P_ADESC_NOSECONDARYRAIL", R.string.desc_a_nosecondaryrail);

        //Kits
        kits.put("ID_P_IDESC_M67", R.string.desc_k_m67);
        kits.put("ID_P_IDESC_MAV", R.string.desc_k_mav);
        kits.put("ID_P_IDESC_C4", R.string.desc_k_c4);
        kits.put("ID_P_IDESC_MEDKIT", R.string.desc_k_medkit);
        kits.put("ID_P_IDESC_MORTAR", R.string.desc_k_mortar);
        kits.put("ID_P_IDESC_MINE", R.string.desc_k_mine);
        kits.put("ID_P_IDESC_NOGADGET2", R.string.desc_k_nogadget2);
        kits.put("ID_P_IDESC_NOGADGET1", R.string.desc_k_nogadget1);
        kits.put("ID_P_IDESC_DEFIB", R.string.desc_k_defib);
        kits.put("ID_P_IDESC_CLAYMORE", R.string.desc_k_claymore);
        kits.put("ID_P_IDESC_REPAIR", R.string.desc_k_repair);
        kits.put("ID_P_IDESC_UGS", R.string.desc_k_ugs);
        kits.put("ID_P_IDESC_EOD", R.string.desc_k_eod);
        kits.put("ID_P_IDESC_SOFLAM", R.string.desc_k_soflam);
        kits.put("ID_P_IDESC_AMMO", R.string.desc_k_ammo);
        kits.put("ID_P_IDESC_BEACON", R.string.desc_k_beacon);

        //Skills
        skills.put("ID_P_SDESC_Suppr2", R.string.desc_s_suppr2);
        skills.put("ID_P_SDESC_ExplRes2", R.string.desc_s_explres2);
        skills.put("ID_P_SDESC_Sprint", R.string.desc_s_sprint);
        skills.put("ID_P_SDESC_SuppRes2", R.string.desc_s_suppres2);
        skills.put("ID_P_SDESC_Heal", R.string.desc_s_heal);
        skills.put("ID_P_SDESC_Gren", R.string.desc_s_gren);
        skills.put("ID_P_SDESC_Gren2", R.string.desc_s_gren2);
        skills.put("ID_P_SDESC_Heal2", R.string.desc_s_heal2);
        skills.put("ID_P_SDESC_SuppRes", R.string.desc_s_suppres);
        skills.put("ID_P_SDESC_ExplRes", R.string.desc_s_explres);
        skills.put("ID_P_SDESC_Sprint2", R.string.desc_s_sprint2);
        skills.put("ID_P_SDESC_Expl2", R.string.desc_s_expl2);
        skills.put("ID_P_SDESC_Expl", R.string.desc_s_expl);
        skills.put("ID_P_SDESC_Clips2", R.string.desc_s_clips2);
        skills.put("ID_P_SDESC_Suppr", R.string.desc_s_suppr);
        skills.put("ID_P_SDESC_NoSpec", R.string.desc_s_nospec);
        skills.put("ID_P_SDESC_Clips", R.string.desc_s_clips);


        //Awards
        /* TODO: */
        
        
    }
    
    //Getters
    public static int getWeapon(String s) {
        
        return weapons.containsKey(s) ? weapons.get(s) : R.string.desc_not_found;
        
    }
    
    public static int getAttachment(String s) {
        
        return attachments.containsKey(s) ? attachments.get(s) : R.string.desc_not_found;
        
    }
    
    public static int getVehicle(String s) {
        
        return vehicles.containsKey(s) ? vehicles.get(s) : R.string.desc_not_found;
        
    }
    
    public static int getVehicleUpgrade(String s) {
        
        return vehicleUpgrades.containsKey(s) ? vehicleUpgrades.get(s) : R.string.desc_not_found;
        
    }
    
    public static int getKit(String s) {
        
        return kits.containsKey(s) ? kits.get(s) : R.string.desc_not_found;
        
    }
    
    public static int getAward(String s) {
        
        return awards.containsKey(s) ? awards.get(s) : R.string.desc_not_found;
        
    }
    
    public static int getSkill(String s) {
        
        return skills.containsKey(s) ? skills.get(s) : R.string.desc_not_found;
        
    }
    
    public static int getDogtag(String s) {
        
        return dogtags.containsKey(s) ? dogtags.get(s) : R.string.desc_not_found;
        
    }
    
}