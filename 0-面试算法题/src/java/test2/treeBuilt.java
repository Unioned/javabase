package test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class treeBuilt {

    public static void main(String[] args) {
        List<ResultNode> resultNodeList = getTree();
        List<TreeNodeVO> treeNodeVOList = new ArrayList<>();
        for (ResultNode resultNode : resultNodeList) {
            TreeNodeVO treeNodeVO = new TreeNodeVO();
            treeNodeVO.setOrgId(resultNode.getOrgId());
            treeNodeVO.setOrgName(resultNode.getOrgName());
            treeNodeVO.setParentId(resultNode.getParentId());
            treeNodeVOList.add(treeNodeVO);
        };
        List<TreeNodeVO> tree = createTree(treeNodeVOList, "-1");
        System.out.println(tree);
    }

    private static List<TreeNodeVO> createTree(List<TreeNodeVO> list,String pid){
        List<TreeNodeVO> treeNodeVOList = new ArrayList<>();
        for (TreeNodeVO treeNodeVO : list) {
            if (Objects.equals(treeNodeVO.getParentId(), pid)){
                treeNodeVO.setChildren(createTree(list,treeNodeVO.getOrgId()));
                treeNodeVOList.add(treeNodeVO);
            }
        }
        return treeNodeVOList;
    }

    private static List<ResultNode> getTree(){
        List<ResultNode> resultNodeList = new ArrayList<>();
        resultNodeList.add(new ResultNode("c2c4b4038d5742f09685e8b2fed3fbf5", "天心区人力资源和社会保障局", "5cb9ed702b16409a98dd5c6549a8e896"));
        resultNodeList.add(new ResultNode("57c889f3529a49d6986766bf96f7b9df", "岳麓区人力资源和社会保障局", "5cb9ed702b16409a98dd5c6549a8e896"));
        resultNodeList.add(new ResultNode("f109bad00d424814b354321aa489e99e", "开福区人力资源和社会保障局", "5cb9ed702b16409a98dd5c6549a8e896"));
        resultNodeList.add(new ResultNode("86fad13ba61b4f38acefb2010635a5b1", "雨花区人力资源和社会保障局", "5cb9ed702b16409a98dd5c6549a8e896"));
        resultNodeList.add(new ResultNode("28c67a32e0df4d16ab980ff530b2b374", "长沙县人力资源和社会保障局", "5cb9ed702b16409a98dd5c6549a8e896"));
        resultNodeList.add(new ResultNode("61c8d4812fdf4a9dad484a4374f1c56e", "望城区人力资源和社会保障局", "5cb9ed702b16409a98dd5c6549a8e896"));
        resultNodeList.add(new ResultNode("82abb83243c24c949a31901b2c4351c6", "宁乡市人力资源和社会保障局", "5cb9ed702b16409a98dd5c6549a8e896"));
        resultNodeList.add(new ResultNode("5b5f6690210c4b669ac3b9a6b85fa81c", "浏阳市人力资源和社会保障局", "5cb9ed702b16409a98dd5c6549a8e896"));
        resultNodeList.add(new ResultNode("e536b80bc5874d5d9987911782541c9a", "渌口区人力资源和社会保障局", "3b9f58b1b33d48e3b0b7b8641349eb2a"));
        resultNodeList.add(new ResultNode("36996c9c110b4f84a3afc1b4b6067baf", "攸县人力资源和社会保障局", "3b9f58b1b33d48e3b0b7b8641349eb2a"));
        resultNodeList.add(new ResultNode("1abdf4be068a4f32aefa92da9c2db495", "茶陵县人力资源和社会保障局", "3b9f58b1b33d48e3b0b7b8641349eb2a"));
        resultNodeList.add(new ResultNode("c7695b2714764fd3943e3c10502c7027", "炎陵县人力资源和社会保障局", "3b9f58b1b33d48e3b0b7b8641349eb2a"));
        resultNodeList.add(new ResultNode("2afcca0d570146a7bf0dbc86b4b60b74", "云龙区人力资源和社会保障局", "3b9f58b1b33d48e3b0b7b8641349eb2a"));
        resultNodeList.add(new ResultNode("ebc15de4408746ed91ecb53f496b2f95", "醴陵市人力资源和社会保障局", "3b9f58b1b33d48e3b0b7b8641349eb2a"));
        resultNodeList.add(new ResultNode("ed2b67d224c34933a863ae2cdd36ba64", "岳塘区人力资源和社会保障局", "68ce7ad04e8548dfb7d4017d9a713c5a"));
        resultNodeList.add(new ResultNode("ce08330be2d845ec9c75e7b0ce3adaef", "湘潭县人力资源和社会保障局", "68ce7ad04e8548dfb7d4017d9a713c5a"));
        resultNodeList.add(new ResultNode("7a8f55fae557483ab052543763688fcc", "株洲市荷塘区人力资源和社会保障局", "3b9f58b1b33d48e3b0b7b8641349eb2a"));
        resultNodeList.add(new ResultNode("3d3ae6200bd64e2bbb93d156a0ae667a", "芦淞区人力资源和社会保障局", "3b9f58b1b33d48e3b0b7b8641349eb2a"));
        resultNodeList.add(new ResultNode("19a6025152dd41098bcdb6dafd0d2092", "石峰区人力资源和社会保障局", "3b9f58b1b33d48e3b0b7b8641349eb2a"));
        resultNodeList.add(new ResultNode("9dc3fda627e5450da60d0fa3a224a629", "天元区人力资源和社会保障局", "3b9f58b1b33d48e3b0b7b8641349eb2a"));
        resultNodeList.add(new ResultNode("a8d753eb340c4fc2a47f4867e27395c3", "湘乡市人力资源和社会保障局", "68ce7ad04e8548dfb7d4017d9a713c5a"));
        resultNodeList.add(new ResultNode("1", "湖南省人力资源和社会保障厅", "-1"));
        resultNodeList.add(new ResultNode("dba5dd7ac81a4c8bb22fc046dd292d80", "凤凰县人力资源和社会保障局", "6bf4f8ebb9cf4c2d8013c40e3a7d0103"));
        resultNodeList.add(new ResultNode("4134be5db05445e095c2ded6c379323f", "花垣县人力资源和社会保障局", "6bf4f8ebb9cf4c2d8013c40e3a7d0103"));
        resultNodeList.add(new ResultNode("a98871cffa3d4822a1e8492cd1ea94e7", "保靖县人力资源和社会保障局", "6bf4f8ebb9cf4c2d8013c40e3a7d0103"));
        resultNodeList.add(new ResultNode("442a088b0fd142849f558a885a62ece1", "古丈县人力资源和社会保障局", "6bf4f8ebb9cf4c2d8013c40e3a7d0103"));
        resultNodeList.add(new ResultNode("eedb4e095ec642beaa22f4495625d859", "永顺县人力资源和社会保障局", "6bf4f8ebb9cf4c2d8013c40e3a7d0103"));
        resultNodeList.add(new ResultNode("8f46d4861cd84f08b0d62e8035ce311c", "龙山县人力资源和社会保障局", "6bf4f8ebb9cf4c2d8013c40e3a7d0103"));
        resultNodeList.add(new ResultNode("50933294a3d647ed9ec54265ef3ff85b", "慈利县人力资源和社会保障局", "02a93a40ae784a6e8a212ebbf1b088f7"));
        resultNodeList.add(new ResultNode("9da6865995c641d299307c0f54554784", "桑植县人力资源和社会保障局", "02a93a40ae784a6e8a212ebbf1b088f7"));
        resultNodeList.add(new ResultNode("0990be3a3a084c22b20aa89df7618293", "资阳区人力资源和社会保障局", "aa61857692a44da98edb7691ac81e8ac"));
        resultNodeList.add(new ResultNode("513195ea1e2e42ac891d709b021763a2", "赫山区人力资源和社会保障局", "aa61857692a44da98edb7691ac81e8ac"));
        resultNodeList.add(new ResultNode("38c9fec1e66742679c60633d36ae865b", "南县人力资源和社会保障局", "aa61857692a44da98edb7691ac81e8ac"));
        resultNodeList.add(new ResultNode("c69a5f90326e45098c7f02b7bc3bb840", "西洞庭管理区人力资源和社会保障局", "6cdf272301b746de89a4ba1905898fb0"));
        resultNodeList.add(new ResultNode("4f1f096947fe42b4b609eb081a74c94d", "西湖区人力资源和社会保障局", "6cdf272301b746de89a4ba1905898fb0"));
        resultNodeList.add(new ResultNode("425c6f3cd3fc4adcbcc873434abcd377", "津市市人力资源和社会保障局", "6cdf272301b746de89a4ba1905898fb0"));
        resultNodeList.add(new ResultNode("ec2e9f3a29db43bda3d4626b6679879a", "永定区人力资源和社会保障局", "02a93a40ae784a6e8a212ebbf1b088f7"));
        resultNodeList.add(new ResultNode("a704b96e4db745578808e9d0fa098c95", "武陵源区人力资源和社会保障局", "02a93a40ae784a6e8a212ebbf1b088f7"));
        resultNodeList.add(new ResultNode("95260b8dc97b403590fd54ccb707132f", "桃江县人力资源和社会保障局", "aa61857692a44da98edb7691ac81e8ac"));
        resultNodeList.add(new ResultNode("1df590308f094d5bb55f688801dad471", "安化县人力资源和社会保障局", "aa61857692a44da98edb7691ac81e8ac"));
        resultNodeList.add(new ResultNode("23b44cd42ff8455ba081d34bf3e259bf", "大通湖区人力资源和社会保障局", "aa61857692a44da98edb7691ac81e8ac"));
        resultNodeList.add(new ResultNode("c59aadf1d6014e11b78783761096fa18", "沅江市人力资源和社会保障局", "aa61857692a44da98edb7691ac81e8ac"));
        resultNodeList.add(new ResultNode("70b166d16b094c9493c37307d5889da1", "北湖区人力资源和社会保障局", "bf6828736f994eb48825c02849fdf59d"));
        resultNodeList.add(new ResultNode("66c686ed025f4e48ac63dff3878136e2", "苏仙区人力资源和社会保障局", "bf6828736f994eb48825c02849fdf59d"));
        resultNodeList.add(new ResultNode("201ca900060d4bbcac6222812ded126e", "桂阳县人力资源和社会保障局", "bf6828736f994eb48825c02849fdf59d"));
        resultNodeList.add(new ResultNode("ed21d0bd66eb4baa90ca2e8f9af8d0bb", "宜章县人力资源和社会保障局", "bf6828736f994eb48825c02849fdf59d"));
        resultNodeList.add(new ResultNode("22079364e4324032a2ca8ebad5b9eb15", "永兴县人力资源和社会保障局", "bf6828736f994eb48825c02849fdf59d"));
        resultNodeList.add(new ResultNode("6602115951c94bb8b2cb1c994941fb9a", "嘉禾县人力资源和社会保障局", "bf6828736f994eb48825c02849fdf59d"));
        resultNodeList.add(new ResultNode("1b27777106dd4c44a274159f8c5d8470", "临武县人力资源和社会保障局", "bf6828736f994eb48825c02849fdf59d"));
        resultNodeList.add(new ResultNode("0901cdd3146a4a0b91e34e835f169241", "汝城县人力资源和社会保障局", "bf6828736f994eb48825c02849fdf59d"));
        resultNodeList.add(new ResultNode("47448eb390dd4a6da7d863a7263cf47c", "桂东县人力资源和社会保障局", "bf6828736f994eb48825c02849fdf59d"));
        resultNodeList.add(new ResultNode("eaf132ad79914309a2cd51a23cae3c67", "安仁县人力资源和社会保障局", "bf6828736f994eb48825c02849fdf59d"));
        resultNodeList.add(new ResultNode("ce08ef3923434d278e0f258f626e9a75", "资兴市人力资源和社会保障局", "bf6828736f994eb48825c02849fdf59d"));
        resultNodeList.add(new ResultNode("83ab5e2f54184869b98e7eda1319b85a", "零陵区人力资源和社会保障局", "1665ab2697874b0bb3aebfd57a54e64a"));
        resultNodeList.add(new ResultNode("fcd53613361f4456a477c1e9b73b865e", "冷水滩区人力资源和社会保障局", "1665ab2697874b0bb3aebfd57a54e64a"));
        resultNodeList.add(new ResultNode("1b025bfd9f2c4217a1309115b535c3ed", "祁阳县人力资源和社会保障局", "1665ab2697874b0bb3aebfd57a54e64a"));
        resultNodeList.add(new ResultNode("df301828f21d4c63b877547df239feee", "东安县人力资源和社会保障局", "1665ab2697874b0bb3aebfd57a54e64a"));
        resultNodeList.add(new ResultNode("56dc6b2edc6e4f7b9e1b78e771086282", "金洞管理区人力资源和社会保障局", "1665ab2697874b0bb3aebfd57a54e64a"));
        resultNodeList.add(new ResultNode("70cc9b276afd4e56a826f9eb473f5a76", "鹤城区人力资源和社会保障局", "1b7cee7b4c2140e682598afdf9da102c"));
        resultNodeList.add(new ResultNode("5434c16ec29b43dcbd1583d0824c1c56", "中方县人力资源和社会保障局", "1b7cee7b4c2140e682598afdf9da102c"));
        resultNodeList.add(new ResultNode("82c32021e3b34903bc9e9f7a5cd04bc7", "沅陵县人力资源和社会保障局", "1b7cee7b4c2140e682598afdf9da102c"));
        resultNodeList.add(new ResultNode("84e8c0d00504473aa49c7d134f9aad92", "辰溪县人力资源和社会保障局", "1b7cee7b4c2140e682598afdf9da102c"));
        resultNodeList.add(new ResultNode("3e67201754c9435cb835de8a27ceb29e", "溆浦县人力资源和社会保障局", "1b7cee7b4c2140e682598afdf9da102c"));
        resultNodeList.add(new ResultNode("f19ac42f41a846c292ad99e923670a44", "双牌县人力资源和社会保障局", "1665ab2697874b0bb3aebfd57a54e64a"));
        resultNodeList.add(new ResultNode("418ffb771fc54e20bbd313c8077b3173", "道县人力资源和社会保障局", "1665ab2697874b0bb3aebfd57a54e64a"));
        resultNodeList.add(new ResultNode("4a2b42523690415fa8da97303e38d0eb", "江永县人力资源和社会保障局", "1665ab2697874b0bb3aebfd57a54e64a"));
        resultNodeList.add(new ResultNode("7bd7fd84c1dc4693a8647cc887056dfb", "宁远县人力资源和社会保障局", "1665ab2697874b0bb3aebfd57a54e64a"));
        resultNodeList.add(new ResultNode("a0d518da57dd4e5997b5fb80516e9b2c", "蓝山县人力资源和社会保障局", "1665ab2697874b0bb3aebfd57a54e64a"));
        resultNodeList.add(new ResultNode("66d685a8fb744b78b37e936de950a79e", "新田县人力资源和社会保障局", "1665ab2697874b0bb3aebfd57a54e64a"));
        resultNodeList.add(new ResultNode("67c31f7973ad4731a2bdf68b12b17a95", "江华瑶族自治县人力资源和社会保障局", "1665ab2697874b0bb3aebfd57a54e64a"));
        resultNodeList.add(new ResultNode("4fd6fc5966d345dda969701ae35c04a8", "回龙圩区人力资源和社会保障局", "1665ab2697874b0bb3aebfd57a54e64a"));
        resultNodeList.add(new ResultNode("853b5a6ff36f4b088b619d1f6b9293d0", "会同县人力资源和社会保障局", "1b7cee7b4c2140e682598afdf9da102c"));
        resultNodeList.add(new ResultNode("a7abfe0ff32a4169892c3c317103cd63", "麻阳苗族自治县人力资源和社会保障局", "1b7cee7b4c2140e682598afdf9da102c"));
        resultNodeList.add(new ResultNode("dc7dcdbe1658440786ddd08ea1105bfd", "新晃侗族自治县人力资源和社会保障局", "1b7cee7b4c2140e682598afdf9da102c"));
        resultNodeList.add(new ResultNode("4ff7bc3a16e348558b9fb5699842c57b", "芷江侗族自治县人力资源和社会保障局", "1b7cee7b4c2140e682598afdf9da102c"));
        resultNodeList.add(new ResultNode("d02ec5f7ceca49a4992371d2259cdd91", "靖州苗族侗族自治县人力资源和社会保障局", "1b7cee7b4c2140e682598afdf9da102c"));
        resultNodeList.add(new ResultNode("8a9c9813731f4ec39ba2aab7d17f2811", "通道侗族自治县人力资源和社会保障局", "1b7cee7b4c2140e682598afdf9da102c"));
        resultNodeList.add(new ResultNode("26f480aac2bd4019b65369222df1b803", "洪江区人力资源和社会保障局", "1b7cee7b4c2140e682598afdf9da102c"));
        resultNodeList.add(new ResultNode("5a0052577c094403ada32077b68c9748", "洪江市人力资源和社会保障局", "1b7cee7b4c2140e682598afdf9da102c"));
        resultNodeList.add(new ResultNode("3f94f1ce59b84cd39abe717f1ec9f638", "娄星区人力资源和社会保障局", "88b3b5003479441dbb2c9a39b934af45"));
        resultNodeList.add(new ResultNode("0a24cdaec00f443fa63c3244f0459593", "双峰县人力资源和社会保障局", "88b3b5003479441dbb2c9a39b934af45"));
        resultNodeList.add(new ResultNode("7cf75ac389bc433c8f19b89b299afd2f", "新化县人力资源和社会保障局", "88b3b5003479441dbb2c9a39b934af45"));
        resultNodeList.add(new ResultNode("20cbd6df85574aeb8ff31310bbe03d78", "冷水江市人力资源和社会保障局", "88b3b5003479441dbb2c9a39b934af45"));
        resultNodeList.add(new ResultNode("57ad85eea4094abab73cb4a47d3e59d5", "涟源市人力资源和社会保障局", "88b3b5003479441dbb2c9a39b934af45"));
        resultNodeList.add(new ResultNode("c8aa13fc893e496cab8b54cccabc80bf", "韶山市人力资源和社会保障局", "68ce7ad04e8548dfb7d4017d9a713c5a"));
        resultNodeList.add(new ResultNode("78d4fb180ce74058a6c8d8a2734ed3b9", "珠晖区人力资源和社会保障局", "e4375cddf3d047ac820e71fc47067a9c"));
        resultNodeList.add(new ResultNode("4f57ca467cd647ea82842ad304e3c327", "雁峰区人力资源和社会保障局", "e4375cddf3d047ac820e71fc47067a9c"));
        resultNodeList.add(new ResultNode("e6987884bd58456b915767a60b500035", "石鼓区人力资源和社会保障局", "e4375cddf3d047ac820e71fc47067a9c"));
        resultNodeList.add(new ResultNode("50b0e276f0824c2aad24ec317031799d", "蒸湘区人力资源和社会保障局", "e4375cddf3d047ac820e71fc47067a9c"));
        resultNodeList.add(new ResultNode("b7f68b42ed6a49fc80c3ba09c7dfa892", "南岳区人力资源和社会保障局", "e4375cddf3d047ac820e71fc47067a9c"));
        resultNodeList.add(new ResultNode("e3f3d4f3768f475db293bfb8b76bd5ef", "衡阳县人力资源和社会保障局", "e4375cddf3d047ac820e71fc47067a9c"));
        resultNodeList.add(new ResultNode("81d97d689ace446bb6e0278bde364fe5", "衡南县人力资源和社会保障局", "e4375cddf3d047ac820e71fc47067a9c"));
        resultNodeList.add(new ResultNode("4f7d1366299d4514a3d12999b1f3212f", "衡山县人力资源和社会保障局", "e4375cddf3d047ac820e71fc47067a9c"));
        resultNodeList.add(new ResultNode("650935d1ec7f4448b7754f73e89dd6c9", "衡东县人力资源和社会保障局", "e4375cddf3d047ac820e71fc47067a9c"));
        resultNodeList.add(new ResultNode("3eda33eef2ca42be842e06d33e31b424", "祁东县人力资源和社会保障局", "e4375cddf3d047ac820e71fc47067a9c"));
        resultNodeList.add(new ResultNode("59d859f587a645988248ab79c2aeaea8", "耒阳市人力资源和社会保障局", "e4375cddf3d047ac820e71fc47067a9c"));
        resultNodeList.add(new ResultNode("600a5e273e254f2c9f15a8636f514f19", "常宁市人力资源和社会保障局", "e4375cddf3d047ac820e71fc47067a9c"));
        resultNodeList.add(new ResultNode("08fb5380773f43c8baa57a4b2b123207", "双清区人力资源和社会保障局", "c40039697ed24cbd9241f9a2cbeba27b"));
        resultNodeList.add(new ResultNode("612771a0da704abba1064bf3310a520c", "大祥区人力资源和社会保障局", "c40039697ed24cbd9241f9a2cbeba27b"));
        resultNodeList.add(new ResultNode("5ee6f708c7f44111a6a15b853981be5c", "北塔区人力资源和社会保障局", "c40039697ed24cbd9241f9a2cbeba27b"));
        resultNodeList.add(new ResultNode("761adb8b74ea412aab2d6a6cad3ee5bf", "邵东县人力资源和社会保障局", "c40039697ed24cbd9241f9a2cbeba27b"));
        resultNodeList.add(new ResultNode("931fdaa8625a447ebabafcb02fb3308e", "新邵县人力资源和社会保障局", "c40039697ed24cbd9241f9a2cbeba27b"));
        resultNodeList.add(new ResultNode("b54e326b51624feba7efbe9204d99bdf", "邵阳县人力资源和社会保障局", "c40039697ed24cbd9241f9a2cbeba27b"));
        resultNodeList.add(new ResultNode("c983156cdd2244e280291ac9b6c07fdd", "隆回县人力资源和社会保障局", "c40039697ed24cbd9241f9a2cbeba27b"));
        resultNodeList.add(new ResultNode("08a1e9ea52e849e48d3a0414f96584f3", "洞口县人力资源和社会保障局", "c40039697ed24cbd9241f9a2cbeba27b"));
        resultNodeList.add(new ResultNode("542239877e00497dba13901e332d720e", "绥宁县人力资源和社会保障局", "c40039697ed24cbd9241f9a2cbeba27b"));
        resultNodeList.add(new ResultNode("0cc60f80698b4d53a3323d3c5a9f848c", "新宁县人力资源和社会保障局", "c40039697ed24cbd9241f9a2cbeba27b"));
        resultNodeList.add(new ResultNode("1de733c7795745bc89eadd8774f9a4c0", "城步县人力资源和社会保障局", "c40039697ed24cbd9241f9a2cbeba27b"));
        resultNodeList.add(new ResultNode("17f86903515c433c8eaa0bdeab85eab4", "岳阳楼区人力资源和社会保障局", "c0c887d0bb6b445a9ae01736348d5e2e"));
        resultNodeList.add(new ResultNode("09ac81bafa294bfc8ebf012210a5f6cc", "岳阳县人力资源和社会保障局", "c0c887d0bb6b445a9ae01736348d5e2e"));
        resultNodeList.add(new ResultNode("7c4191c03d0f4e0dbd380cd025ae48c0", "华容县人力资源和社会保障局", "c0c887d0bb6b445a9ae01736348d5e2e"));
        resultNodeList.add(new ResultNode("fb441b1b31644a67aab8dce2d59e04c6", "湘阴县人力资源和社会保障局", "c0c887d0bb6b445a9ae01736348d5e2e"));
        resultNodeList.add(new ResultNode("61f5a2179db1450bb474c0ef0ad55397", "平江县人力资源和社会保障局", "c0c887d0bb6b445a9ae01736348d5e2e"));
        resultNodeList.add(new ResultNode("070a298d76814b43a3a8d9df9e967cc2", "屈原区人力资源和社会保障局", "c0c887d0bb6b445a9ae01736348d5e2e"));
        resultNodeList.add(new ResultNode("45a6ccd360df4aec8d458e2ae1533327", "汨罗市人力资源和社会保障局", "c0c887d0bb6b445a9ae01736348d5e2e"));
        resultNodeList.add(new ResultNode("16bb90701eb244788a39b44738b6b0da", "临湘市人力资源和社会保障局", "c0c887d0bb6b445a9ae01736348d5e2e"));
        resultNodeList.add(new ResultNode("9a35323d27654a9c8fad6c8456439b5f", "武陵区人力资源和社会保障局", "6cdf272301b746de89a4ba1905898fb0"));
        resultNodeList.add(new ResultNode("c36aeae7d4bc42b1afb0bd090d290f23", "鼎城区人力资源和社会保障局", "6cdf272301b746de89a4ba1905898fb0"));
        resultNodeList.add(new ResultNode("d809bb4b1e0b4206832896a57e420664", "安乡县人力资源和社会保障局", "6cdf272301b746de89a4ba1905898fb0"));
        resultNodeList.add(new ResultNode("2a04278b810f4d79b7bbbf60549f7874", "汉寿县人力资源和社会保障局", "6cdf272301b746de89a4ba1905898fb0"));
        resultNodeList.add(new ResultNode("d890077ff4d647279d368825bdcab259", "澧县人力资源和社会保障局", "6cdf272301b746de89a4ba1905898fb0"));
        resultNodeList.add(new ResultNode("151c5c60de1b4d788f2be34018829ac4", "临澧县人力资源和社会保障局", "6cdf272301b746de89a4ba1905898fb0"));
        resultNodeList.add(new ResultNode("a045b439ffd34276bcdb8ef1fa803d83", "桃源县人力资源和社会保障局", "6cdf272301b746de89a4ba1905898fb0"));
        resultNodeList.add(new ResultNode("ee76cf9d380348c1bc7ec556f97c1e66", "石门县人力资源和社会保障局", "6cdf272301b746de89a4ba1905898fb0"));
        resultNodeList.add(new ResultNode("5cb9ed702b16409a98dd5c6549a8e896", "长沙市人力资源和社会保障局", "1"));
        resultNodeList.add(new ResultNode("3b9f58b1b33d48e3b0b7b8641349eb2a", "株洲市人力资源和社会保障局", "1"));
        resultNodeList.add(new ResultNode("68ce7ad04e8548dfb7d4017d9a713c5a", "湘潭市人力资源和社会保障局", "1"));
        resultNodeList.add(new ResultNode("e4375cddf3d047ac820e71fc47067a9c", "衡阳市人力资源和社会保障局", "1"));
        resultNodeList.add(new ResultNode("c40039697ed24cbd9241f9a2cbeba27b", "邵阳市人力资源和社会保障局", "1"));
        resultNodeList.add(new ResultNode("c0c887d0bb6b445a9ae01736348d5e2e", "岳阳市人力资源和社会保障局", "1"));
        resultNodeList.add(new ResultNode("6cdf272301b746de89a4ba1905898fb0", "常德市人力资源和社会保障局", "1"));
        resultNodeList.add(new ResultNode("02a93a40ae784a6e8a212ebbf1b088f7", "张家界市人力资源和社会保障局", "1"));
        resultNodeList.add(new ResultNode("aa61857692a44da98edb7691ac81e8ac", "益阳市人力资源和社会保障局", "1"));
        resultNodeList.add(new ResultNode("bf6828736f994eb48825c02849fdf59d", "郴州市人力资源和社会保障局", "1"));
        resultNodeList.add(new ResultNode("1665ab2697874b0bb3aebfd57a54e64a", "永州市人力资源和社会保障局", "1"));
        resultNodeList.add(new ResultNode("1b7cee7b4c2140e682598afdf9da102c", "怀化市人力资源和社会保障局", "1"));
        resultNodeList.add(new ResultNode("88b3b5003479441dbb2c9a39b934af45", "娄底市人力资源和社会保障局", "1"));
        resultNodeList.add(new ResultNode("6bf4f8ebb9cf4c2d8013c40e3a7d0103", "湘西土家族苗族自治州人力资源和社会保障局", "1"));
        resultNodeList.add(new ResultNode("b0d8d8e536834058971d4ac07eda2ac6", "芙蓉区人力资源和社会保障局", "5cb9ed702b16409a98dd5c6549a8e896"));
        resultNodeList.add(new ResultNode("331adf2334d049fd91530af9f4c22508", "吉首市人力资源和社会保障局", "6bf4f8ebb9cf4c2d8013c40e3a7d0103"));
        resultNodeList.add(new ResultNode("f662198f8e5e4a22a15e5574c1824b17", "泸溪县人力资源和社会保障局", "6bf4f8ebb9cf4c2d8013c40e3a7d0103"));
        resultNodeList.add(new ResultNode("dfcfe44c0be142e085db5e909ad20dc1", "长沙市天心区人力资源和社会保障局", "c2c4b4038d5742f09685e8b2fed3fbf5"));
        resultNodeList.add(new ResultNode("f6c011ecb7294541908d965b1dae6fc6", "长沙高新区管委会人力资源和社会保障局", "5cb9ed702b16409a98dd5c6549a8e896"));
        resultNodeList.add(new ResultNode("9d50ba2d55204db7bc6b8dd3fd9add20", "洞口县人力资源和社会保障局", "08a1e9ea52e849e48d3a0414f96584f3"));
        resultNodeList.add(new ResultNode("44ae3d581ffa47f394a667a96489d0cb", "郴州市桂东县人力资源和社会保障局", "47448eb390dd4a6da7d863a7263cf47c"));
        resultNodeList.add(new ResultNode("437a54c75c4e4a829d9c36c205ec8872", "高新区人力资源和社会保障局", "6cdf272301b746de89a4ba1905898fb0"));
        resultNodeList.add(new ResultNode("47bd4b03b298494396c6c44987396e96", "永州市金洞管理区人力资源和社会保障局", "56dc6b2edc6e4f7b9e1b78e771086282"));
        resultNodeList.add(new ResultNode("91fff1bb66d34b61906641483867d89c", "经开区人力资源和社会保障局", "6cdf272301b746de89a4ba1905898fb0"));
        resultNodeList.add(new ResultNode("ca19590706a542049d633c9a56465dcf", "桃花源人力资源和社会保障局", "6cdf272301b746de89a4ba1905898fb0"));
        resultNodeList.add(new ResultNode("fc2dd785b4c74510985d9b50f577f7e1", "祁阳市人力资源和社会保障局", "1b025bfd9f2c4217a1309115b535c3ed"));
        resultNodeList.add(new ResultNode("fe760fca0d084d60a6e9949f2b47701e", "经开区人力资源和社会保障局", "1665ab2697874b0bb3aebfd57a54e64a"));
        resultNodeList.add(new ResultNode("4e9daff46977418a95b6c623a25cb839", "经开区人力资源和社会保障局", "68ce7ad04e8548dfb7d4017d9a713c5a"));
        return resultNodeList;
    }
}
