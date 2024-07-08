/*
 * This file is part of the 京墨（jingmo）APP.
 *
 * (c) 贺丰宝（hefengbao） <hefengbao@foxmail.com>
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 */

package com.hefengbao.jingmo.data.repository

import com.hefengbao.jingmo.data.model.SolarTerm
import javax.inject.Inject

class SolarTermsRepositoryImpl @Inject constructor(

) : SolarTermsRepository {
    override fun getList(): List<SolarTerm> {
        return listOf(
            SolarTerm(
                id = 1,
                type = "",
                name = "立春",
                alias = "岁首、岁节、改岁、立春节、正月节",
                desc = """
                    立春，为二十四节气之首。立，是“开始”之意；春，代表着温暖、生长。二十四节气最初是依据“斗转星移”制定，当北斗七星的斗柄指向寅位时为立春。现行是依据太阳黄经度数定节气，当太阳到达黄经315°时为立春，于每年公历2月3-5日交节。 干支纪元，以寅月为春正、立春为岁首，立春乃万物起始、一切更生之义也，意味着新的一个轮回已开启。在传统观念中，立春有吉祥的涵义。
                    
                    立春标志着万物闭藏的冬季已过去，开始进入风和日暖、万物生长的春季。在自然界，立春最显著的特点就是万物开始有复苏的迹象。时至立春，在我国的北回归线（黄赤交角）及其以南一带，可明显感觉到早春的气息。由于我国幅员辽阔，南北跨度大，各地自然节律不一，“立春”对于很多地区来讲只是入春天的前奏，万物尚未复苏，还处于万物闭藏的冬天。
                """.trimIndent(),
                url = "https://baike.baidu.com/item/%E7%AB%8B%E6%98%A5/8896"
            ),
            SolarTerm(
                id = 2,
                type = "",
                name = "雨水",
                alias = "",
                desc = """
                    雨水，是二十四节气之第2个节气。斗指壬；太阳到达黄经330°；每年公历2月18-20日交节。雨水节气的含义是降雨开始，降雨量极多以小雨或毛毛细雨为主，适宜的降水对农作物的生长很重要，它是农耕文化对于节令的反映。进入雨水节气，中国北方地区尚未有春天气息，南方大多数地方则是春意盎然，一幅早春的景象。
                    
                    雨水节气时段一般从公历2月18日至20日开始，到3月4日或5日结束。时至雨水节气，太阳的直射点也由南半球逐渐向赤道靠近了，这时的北半球，日照时数和强度都在增加，气温回升较快，来自海洋的暖湿空气开始活跃，并渐渐向北挺进与冷空气相遇，形成降雨。雨水时节，天气变化不定，是全年寒潮过程出现最多的时节之一，忽冷忽热，乍暖还寒。
                    
                    春天离不开雨水的滋润，春天的雨水，润物无声，让枯木得以逢春，让种子得以萌发。古代将雨水分为三候：“一候獭祭鱼；二候鸿雁来；三候草木萌动。”雨水正处在数九的“七九”中，河水破冰，大雁北归。雨水相关民俗主要有“补天穿”、“拉保保”、“撞拜寄”等。
                """.trimIndent(),
                url = "https://baike.baidu.com/item/%E9%9B%A8%E6%B0%B4/266315"
            ),
            SolarTerm(
                id = 3,
                type = "",
                name = "惊蛰",
                alias = "启蛰",
                desc = """
                    惊蛰，是二十四节气中的第三个节气。斗指甲，太阳到达黄经345°，于公历3月5-6日交节。惊蛰反映着自然界生物受节律变化影响而萌发、生长的状态。时至惊蛰，阳气上升、气温回暖、春雷乍动、雨水增多，万物生机盎然。农耕生产与大自然的节律息息相关，惊蛰节气在农耕上有着相当重要的意义，它是古代农耕文化对于自然节令的反映。
                    
                    “蛰”，指“藏伏”，昆虫入冬藏伏土中；“惊”指“惊醒”，天上的春雷惊醒蛰虫。所谓“春雷惊百虫”，是指惊蛰时节，春雷始鸣，惊醒蛰伏于地下越冬的蛰虫。在古时惊蛰当日，一些地方人们有用清香、艾草，熏家中四角，以香味驱赶“蛇虫蚊鼠”和霉味，久而久之渐渐演变成惊蛰打小人驱赶霉运习俗。此外还有“蒙鼓皮”“吃梨”“祭白虎化解是非”等习俗。
                    
                    惊蛰节气的标志性特征是春雷乍动、万物生机盎然。从中国各地自然物候进程看，由于南北跨度大，春雷始鸣的时间迟早不一。“惊蛰始雷”仅与中国南方部分地区的自然节律相吻合。
                """.trimIndent(),
                url = "https://baike.baidu.com/item/%E6%83%8A%E8%9B%B0/9428"
            ),
            SolarTerm(
                id = 4,
                type = "",
                name = "春分",
                alias = "",
                desc = """
                    春分，是二十四节气之一，春季第四个节气。斗指卯，太阳黄经达0°，于每年公历3月19-22日交节。春分的“分”有两个含义，一是“季节平分”，传统以立春到立夏之间为春季，而春分日正处于两个节气之中，正好平分了春季；另一含义是“昼夜平分”，在春分这天，太阳直射赤道，昼夜等长，各为12小时。春分的气候特点是天气温暖、阳光明媚。
                    
                    春分在天文学上有重要意义，春分这天太阳直射赤道，南北半球昼夜平分，自这天以后太阳直射位置由赤道继续向北半球推移，北半球各地白昼开始长于黑夜，南半球与之相反。在气候上，也有比较明显的特征，春分后中国除青藏高原、东北地区、西北地区和华北地区北部外均进入了明媚的春天。在这时节，中国民间有放风筝、吃春菜、立蛋等风俗。
                """.trimIndent(),
                url = "https://baike.baidu.com/item/%E6%98%A5%E5%88%86/16864"
            ),
            SolarTerm(
                id = 5,
                type = "",
                name = "清明",
                alias = "踏青节、三月节",
                desc = """
                    清明，是二十四节气之一，春季的第五个节气。斗指乙，太阳到达黄经15°，便为清明。清明节气因为节令期间“气清景明、万物皆显”而得名。清明是反映自然界物候变化的节气，这个时节阳光明媚、草木萌动、百花盛开，自然界呈现一派生机勃勃的景象。中国南方地区，此时已呈气清景明之象；北方地区开始断雪，气温上升，春意融融。
                    
                    清明一般在公历4月4日至6日之间变动，并不固定在某一天，但以4月5日最常见。清明既是节气又是节日，清明节气在时间和天气物候特点上为清明节俗的形成提供了重要条件。清明节气，与岁时物候相关，常以指导农事，有天朗气清、春耕时宜之意；清明节日，是人们扫墓祭祖、慎终追远的日子；因为二者相融，让清明兼具自然和人文内涵。
                """.trimIndent(),
                url = "https://baike.baidu.com/item/%E6%B8%85%E6%98%8E/34808"
            ),
            SolarTerm(
                id = 6,
                type = "",
                name = "谷雨",
                alias = "",
                desc = """
                    谷雨，是二十四节气之第6个节气，春季的最后一个节气。斗指辰；太阳黄经为30°；于每年公历4月19日—21日交节。谷雨取自“雨生百谷”之意，此时降水明显增加，田中的秧苗初插、作物新种，最需要雨水的滋润，降雨量充足而及时，谷类作物能茁壮成长。谷雨与雨水、小满、小雪、大雪等节气一样，都是反映降水现象的节气，是古代农耕文化对于节令的反映。
                    
                    谷雨时节，在中国南方地区，往往开始明显多雨，而特别是华南，一旦冷空气与暖湿空气交汇，往往形成较长时间的降雨天气。秦岭—淮河是南方春雨和北方春旱区之间的过渡地区，从秦岭-淮河附近向北，春雨急剧减少。在北方地区，谷雨是“终霜”的象征。
                    
                    春雨绵绵是谷雨最主要的特点。“谷雨”这一节气名称源自古人“雨生百谷”之说，反映出了节气的农业气候意义。民间在谷雨节气有摘谷雨茶、走谷雨、祭海、吃春、赏花等习俗。
                """.trimIndent(),
                url = "https://baike.baidu.com/item/%E8%B0%B7%E9%9B%A8/6959"
            ),
            SolarTerm(
                id = 7,
                type = "",
                name = "立夏",
                alias = "",
                desc = """
                    立夏，是二十四节气中的第7个节气，夏季的第一个节气，交节时间在每年公历5月05-07日。此时北斗七星的斗柄指向东南方，太阳黄经达45°。历书：“斗指东南维，为立夏，万物至此皆长大，故名立夏也。”时至立夏，万物繁茂。立夏后，日照增加，逐渐升温，雷雨增多。立夏是标示万物进入旺季生长的一个重要节气。
                    
                    立，是建立、开始的意思。夏，在古语里是大的意思。万物至此经已长大，得名立夏。由于中国幅员辽阔、南北跨度大，各地自然节律不一。立夏时节，中国只有福州至南岭一线以南地区呈现“绿树阴浓夏日长，楼台倒影入池塘”的夏季景象；而东北和西北的部分地区这时则刚刚有春天的气息。
                    
                    立夏这天，许多地方有吃“立夏饭”、吃蛋、秤人和尝三新等习俗。进入立夏时节，人们的新陈代谢加快，心脑血液供给不足，常使人烦躁不安，倦怠懒散。应合理安排作息时间，补充营养物质，采取正确的养生保健方法。
                """.trimIndent(),
                url = "https://baike.baidu.com/item/%E7%AB%8B%E5%A4%8F/7587"
            ),
            SolarTerm(
                id = 8,
                type = "",
                name = "小满",
                alias = "",
                desc = """
                    小满，二十四节气中的第八个节气，也是夏季的第二个节气。小满，斗指甲，太阳达黄经60°，于每年公历5月20—22日交节。小满之名，有两层含义。第一，与气候降水有关。小满节气期间南方的暴雨开始增多，降水频繁；民谚云“小满小满，江河渐满”。小满中的“满”，指雨水之盈。第二， 与农业小麦有关。在北方地区小满节气期间降雨较少甚至无雨，这个“满”不是指降水，而是指小麦的饱满程度。
                    
                    小满节气期间，中国南方地区一般会降雨多、雨量大；来自海洋的暖湿气流活跃，与从北方南进的冷空气交汇，这时华南地区往往会出现持续大范围的强降水，造成暴雨或特大暴雨；江南地区往往也是江河湖满，如果这个阶段雨水偏少，可能是太平洋的副热带高压势力较弱，位置偏南了，意味着到了黄梅时节。在北方，小满节气期间降雨很少或无雨，这期间气温上升很快，与南方的温差进一步缩小。
                    
                    “二十四节气”是中国古代农耕文明的产物，它不仅是指导农耕生产的时节体系，更是包含有丰富民俗事象的民俗系统。小满节气民俗根据农耕社会特点形成，节气民俗主要有“小满祭车神”、“小满动三车（水车、油车和丝车）”、“小满抢水”、“小满祈蚕节”、“小满食野菜”等。
                """.trimIndent(),
                url = "https://baike.baidu.com/item/%E5%B0%8F%E6%BB%A1/35961"
            ),
            SolarTerm(
                id = 9,
                type = "",
                name = "芒种",
                alias = "忙种",
                desc = """
                    芒种，是二十四节气之第九个节气，夏季的第三个节气，干支历午月的起始。斗指巳，太阳黄经达75°，于每年公历6月5-7日交节。“芒种”含义是“有芒之谷类作物可种，过此即失效”。这个时节气温显著升高、雨量充沛、空气湿度大，适宜晚稻等谷类作物种植。农事耕种以“芒种”这节气为界，过此之后种植成活率就越来越低。它是古代农耕文化对于节令的反映。
                    
                    芒种节气在农耕上有着相当重要的意义。农历书说：“斗指巳为芒种，此时可种有芒之谷，过此即失效，故名芒种也。”意思是讲，芒种节气适合种植有芒的谷类作物；其也是种植农作物时机的分界点，过此即失效。民谚“芒种不种，再种无用”讲的就是这个道理。芒种是一个耕种忙碌的节气，民间也称其为“忙种”。这个时节，正是南方种稻与北方收麦之时。
                """.trimIndent(),
                url = "https://baike.baidu.com/item/%E8%8A%92%E7%A7%8D/487968"
            ),
            SolarTerm(
                id = 10,
                type = "",
                name = "夏至",
                alias = "夏节、夏至节",
                desc = """
                    夏至，是二十四节气的第10个节气。斗指午；太阳黄经90°；于公历6月21~22日交节。夏至这天，太阳直射地面的位置到达一年的最北端，几乎直射北回归线，此时，北半球各地的白昼时间达到全年最长。对于北回归线及其以北的地区来说，夏至也是一年中正午太阳高度最高的一天。
                    
                    夏至是太阳北行的转折点。夏至过后，太阳直射点开始从北回归线向南移动，北半球白昼开始逐渐变短。对于中国位于北回归线以北地区来说，夏至过后，正午太阳高度开始逐日降低；对于中国位于北回归线以南地区来说，正午太阳高度在夏至过后经南返，太阳再次直射后才开始逐日降低。
                    
                    气温高、湿度大、不时出现雷阵雨，是夏至后的天气特点。夏至在中夏之位，即午位，午属阳；夏至虽然阳气较盛，且白昼最长，但却未必是一年中最热的一天，因此时接近地表的热量仍在积蓄，并没有达到最多的时候。夏至既是二十四节气之一，古时也是民间“四时八节”中的一个节日，自古民间有在夏至拜神祭祖的习俗。此外，夏至后，人们普遍会食用清补凉汤、凉茶、酸梅汤等来避暑。
                """.trimIndent(),
                url = "https://baike.baidu.com/item/%E5%A4%8F%E8%87%B3/12033"
            ),
            SolarTerm(
                id = 11,
                type = "",
                name = "小暑",
                alias = "",
                desc = """
                    小暑，是二十四节气之第十一个节气，干支历午月的结束以及未月的起始。斗指辛，太阳到达黄经105度，于每年公历7月6-8日交节。暑，是炎热的意思，小暑为小热，还不十分热。小暑虽不是一年中最炎热的时节，但紧接着就是一年中最热的节气大暑，民间有“小暑大暑，上蒸下煮”之说。中国多地自小暑起进入雷暴最多的时节。
                    
                    小暑开始进入伏天，所谓“热在三伏”，三伏天通常出现在小暑与处暑之间，是一年中气温最高且又潮湿、闷热的时段。季风气候是中国气候的主要特点，夏季受来自海洋暖湿气流的影响，中国多地高温潮湿多雨。小暑这个时节虽然阳光猛烈、高温潮湿多雨，但对于农作物来讲，雨热同期有利于成长。
                    
                    在过去中国南方地区民间有小暑“食新”习俗，即在小暑过后尝新米，农民将新割的稻谷碾成米后，做好饭供祀五谷大神和祖先，然后人人吃尝新酒等。在北方地区有头伏吃饺子的传统，伏日人们食欲不振，往往比常日消瘦，俗谓之苦夏，而饺子在传统习俗里正是开胃解馋的食物，且饺子的外形像元宝，有“元宝藏福”的意思，吃饺子象征着福气满满。
                """.trimIndent(),
                url = "https://baike.baidu.com/item/%E5%B0%8F%E6%9A%91/488269"
            ),
            SolarTerm(
                id = 12,
                type = "",
                name = "大暑",
                alias = "",
                desc = """
                    大暑，是二十四节气中的第十二个节气，也是夏季最后一个节气。斗指未，太阳黄经为120°，于公历7月22日—24日交节。“暑”是炎热的意思，大暑，指炎热之极。大暑相对小暑，更加炎热，是一年中阳光最猛烈、最炎热的节气，“湿热交蒸”在此时到达顶点。大暑气候特征：高温酷热、雷暴、台风频繁。
                    
                    大暑节气正值“三伏天”里的“中伏”前后，是一年中最热的时段。大暑时节阳光猛烈、高温潮湿多雨，虽不免有湿热难熬之苦，却十分有利于农作物成长，农作物在此期间成长最快。
                    
                    自古以来，民间有大暑三伏天饮凉茶（伏茶）的习俗；伏茶顾名思义，是三伏天饮的茶，这种由中草药煮成的茶水有清凉祛暑的作用。此外，还有烧伏香、晒伏姜等习俗。“大暑”是一年中天气最热、湿气最重的时节，此时节养生保健的重点是“防暑”和“祛湿”。
                """.trimIndent(),
                url = "https://baike.baidu.com/item/%E5%A4%A7%E6%9A%91/9849"
            ),
            SolarTerm(
                id = 13,
                type = "",
                name = "立秋",
                alias = "",
                desc = """
                    立秋，是“二十四节气”之第十三个节气，也是秋季的起始。斗指西南，太阳达黄经135°，在每年公历8月7、8日或9日。“立”，是开始之意；“秋”，意为禾谷成熟。整个自然界的变化是循序渐进的过程，立秋是阳气渐收、阴气渐长，由阳盛逐渐转变为阴盛的转折。在自然界，万物开始从繁茂成长趋向成熟。
                    
                    立秋是二十四节气中仅次于大暑小暑的第三热节气。在节气排列顺序上，处暑在立秋之后，秋季第二个节气“处暑”（末暑）才出暑。二十四节气有“三暑”（小暑、大暑、处暑），“三暑”中间还夹一个“立秋”节气，立秋之后才是处暑（末暑）。“三暑”与“三伏”均代表高温酷热天气，“三伏天”涉及小暑、大暑、立秋、处暑四个节气。在二十四节气中，暑天比较长。
                    
                    立秋意味着降水、湿度等，处于一年中的转折点，趋于减少或下降。从立秋开始，阳气渐收，万物内敛。立秋与立春、立夏、立冬并称“四立”，也是古时“四时八节”之一。秋天是禾谷成熟、收获的季节。立秋时，古时民间有祭祀土地神，庆祝丰收的习俗。还有“贴秋膘”、“咬秋”等习俗。
                """.trimIndent(),
                url = "https://baike.baidu.com/item/%E7%AB%8B%E7%A7%8B/9465"
            ),
            SolarTerm(
                id = 14,
                type = "",
                name = "处暑",
                alias = "",
                desc = """
                    处暑，是二十四节气之第十四个节气，也是秋季的第二个节气。斗指戊（西南方）；太阳黄经达150°；于每年公历8月22-24日交节。时至处暑，已到了高温酷热天气“三暑”之“末暑”，意味着酷热难熬的天气到了尾声。
                    
                    处暑后，太阳直射点继续南移、太阳辐射减弱，副热带高压也向南撤退，暑意渐消。雷暴活动也不及炎夏那般活跃，全国各地的暴雨总趋势减弱。处暑的民俗活动很多，如吃鸭子、放河灯、开渔节、煎药茶、拜土地公等。
                """.trimIndent(),
                url = "https://baike.baidu.com/item/%E5%A4%84%E6%9A%91/488721"
            ),
            SolarTerm(
                id = 15,
                type = "",
                name = "白露",
                alias = "",
                desc = """
                    白露，是“二十四节气”中的第15个节气，秋季第3个节气，干支历申月的结束与酉月的起始。斗指癸；太阳达黄经165度；于公历9月7-9日交节。“白露”是反映自然界寒气增长的重要节气。由于冷空气转守为攻，白昼有阳光尚热，但傍晚后气温便很快下降，昼夜温差逐渐拉大。
                    
                    时至白露，夏季风逐渐为冬季风所代替，冷空气转守为攻，加上太阳直射点南移，北半球日照时间变短，光照强度减弱，地面辐射散热快，所以温度下降速度也逐渐加快。白露基本结束了暑天的闷热，天气渐渐转凉，寒生露凝。古人以四时配五行，秋属金，金色白，以白形容秋露，故名“白露”。
                    
                    按近代学者张宝堃提出的“候平均气温”标准，候平均温度在10-22℃期间为春季或秋季，按此标准，从白露节气开始，各地陆续开始进入到秋天。民谚云：‘白露身弗露。’言至是天气乃肃，可以授衣耳。”意在提醒人们此时白天尚热，但早晚天气已有凉意，如果打赤膊就容易着凉。此外，这个时节还需预防秋燥。白露期间的各地民俗，主要有祭祀大禹、酿五谷酒、喝白露茶等。
                """.trimIndent(),
                url = "https://baike.baidu.com/item/%E7%99%BD%E9%9C%B2/8039"
            ),
            SolarTerm(
                id = 16,
                type = "",
                name = "秋分",
                alias = "",
                desc = """
                    秋分，是二十四节气之第十六个节气，秋季第四个节气。斗指酉；太阳达黄经180°；于每年的公历9月22-24日交节。秋分这天太阳几乎直射地球赤道，全球各地昼夜等长  。秋分，“分”即为“平分”、“半”的意思，除了指昼夜平分外，还有一层意思是平分了秋季。秋分日后，太阳光直射位置南移，北半球昼短夜长，昼夜温差加大，气温逐日下降。
                    
                    秋分曾是传统的“祭月节”，中秋节由“秋夕祭月”演变而来。2018年6月21日，中华人民共和国国务院关于同意设立“中国农民丰收节”的批复发布，同意自2018年起，将每年秋分设立为“中国农民丰收节”。
                """.trimIndent(),
                url = "https://baike.baidu.com/item/%E7%A7%8B%E5%88%86/9379"
            ),
            SolarTerm(
                id = 17,
                type = "",
                name = "寒露",
                alias = "",
                desc = """
                    寒露，是二十四节气之第十七个节气，秋季的第五个节气。斗指辛；太阳到达黄经195°；在每年公历10月7日-9日交节。寒露，是深秋的节令，干支历戌月的起始。寒露是一个反映气候变化特征的节气。进入寒露，时有冷空气南下，昼夜温差较大，并且秋燥明显。
                    
　                   寒露以后，北方冷空气已有一定势力，中国大部分地区在冷高压控制之下，雨季结束。受冷高压的控制，昼暖夜凉，白天往往秋高气爽。从气候特点上看，寒露时节，南方秋意渐浓，气爽风凉，少雨干燥；北方广大地区已呈现冬天景象。寒露传统习俗主要有赏枫叶、吃芝麻、吃螃蟹、饮秋茶等。
                """.trimIndent(),
                url = "https://baike.baidu.com/item/%E5%AF%92%E9%9C%B2/489013"
            ),
            SolarTerm(
                id = 18,
                type = "",
                name = "霜降",
                alias = "",
                desc = """
                    霜降，是二十四节气中的第十八个节气，秋季的最后一个节气。斗指戌；太阳黄经为210°；于每年公历10月23—24日交节。进入霜降节气后，深秋景象明显，冷空气南下越来越频繁。霜降不是表示“降霜”，而是表示气温骤降、昼夜温差大。就全国平均而言，“霜降”是一年之中昼夜温差最大的时节。
                    
                    霜降时节，万物毕成，毕入于戌，阳下入地，阴气始凝，天气渐寒始于霜降。由于“霜”是天冷、昼夜温差变化大的表现，故以“霜降”命名这个表示“气温骤降、昼夜温差大”的节气。霜降节气特点是早晚天气较冷、中午则比较热，昼夜温差大，秋燥明显。霜降节气主要有赏菊、吃柿子、登高远眺、进补等风俗。
                """.trimIndent(),
                url = "https://baike.baidu.com/item/%E9%9C%9C%E9%99%8D/9380"
            ),
            SolarTerm(
                id = 19,
                type = "",
                name = "立冬",
                alias = "",
                desc = """
                    立冬，是二十四节气之第十九个节气，也是冬季的起始。斗柄指向西北，太阳黄经达225°，于每年公历11月7-8日之间交节。立，建始也；冬，终也，万物收藏也。立冬，意味着生气开始闭蓄，万物进入休养、收藏状态。其气候也由秋季少雨干燥向阴雨寒冻的冬季气候过渡。
                    
                    季节划分常用的方法主要有“节气法”与“气温法”。中国传统上是以“二十四节气”的“立冬”作为冬季起始；“节气法”划分的冬季，表示万物进入休养、收藏状态。“气温法”划分季节以日平均气温连续五天稳定降到10℃以下为冬季起始；气温法划分的冬季，表示天气寒冷了。
                    
                    立冬代表着冬季的开始，它是中国民间非常重视的季节节点之一，春耕夏耘、秋收冬藏，冬季是享受丰收、休养生息的季节。立冬在古代社会也是“四时八节”之一，是个非常重要的节日，在中国部分地区有祭祖、饮宴等习俗。
                """.trimIndent(),
                url = "https://baike.baidu.com/item/%E7%AB%8B%E5%86%AC/489331"
            ),
            SolarTerm(
                id = 20,
                type = "",
                name = "小雪",
                alias = "",
                desc = """
                    小雪，是二十四节气中的第20个节气，冬季第2个节气，时间在每年公历11月22或23日，即太阳到达黄经240°时。小雪是反映降水与气温的节气，它是寒潮和强冷空气活动频数较高的节气。小雪节气的到来，意味着天气会越来越冷、降水量渐增。
                    
                    小雪是一个气候概念，气候要素包括降水、气温、光照等。小雪之名，因“雪”是寒冷天气的产物，这个节气期间的气候寒未深且降水未大，故用“小雪”来比喻这个节气期间的气候特征。“小雪”节气是反映气温与降水变化趋势的节气，并不是表示这个节气下很小量的雪，节气“小雪”与天气中的“小雪”没有必然联系。
                    
                    小雪节气，东亚地区已建立起比较稳定的经向环流，西伯利亚地区常有低压或低槽，东移时会有大规模的冷空气南下，从而带来大范围大风降温天气。
                """.trimIndent(),
                url = "https://baike.baidu.com/item/%E5%B0%8F%E9%9B%AA/1022094"
            ),
            SolarTerm(
                id = 21,
                type = "",
                name = "大雪",
                alias = "",
                desc = """
                    大雪，是二十四节气中的第21个节气，冬季的第三个节气。斗指壬，太阳到达黄经255度，交节时间为每年公历12月6-8日。大雪节气是干支历子月的起始，标志着仲冬时节正式开始。大雪是反映气候特征的一个节气，大雪节气的特点是气温显著下降、降水量增多。
                    
                    “雪”是水汽遇冷的产物，代表寒冷与降水。大雪节气是一个气候概念，它代表的是大雪节气期间的气候特征，即气温与降水量（气象上将雨、雪、雹等从天空下降到地面的水汽凝结物都称为“降水”）。大雪节气与小雪节气一样，都是反映气温与降水变化趋势的节气，它是古代农耕文化对于节令的反映。
                """.trimIndent(),
                url = "https://baike.baidu.com/item/%E5%A4%A7%E9%9B%AA/12827"
            ),
            SolarTerm(
                id = 22,
                type = "",
                name = "冬至",
                alias = "冬节、日短至、亚岁",
                desc = """
                    冬至，又称日南至、冬节、亚岁等，兼具自然与人文两大内涵，既是二十四节气中一个重要的节气，也是中国民间的传统祭祖节日。冬至是四时八节之一，被视为冬季的大节日，在古代民间有“冬至大如年”的讲法。冬至习俗因地域不同而又存在着习俗内容或细节上的差异。在中国南方地区，有冬至祭祖、宴饮的习俗。在中国北方地区，每年冬至日有吃饺子的习俗。
                    
                    冬至是“二十四节气”之第22个节气，斗指子，太阳黄经达270°，于每年公历12月21-23日交节。冬至是太阳直射点南行的极致，冬至这天太阳光直射南回归线，太阳光对北半球最为倾斜，太阳高度角最小，是北半球各地白昼最短、黑夜最长的一天。冬至也是太阳直射点北返的转折点，这天过后它将走“回头路”，太阳直射点开始从南回归线（23°26′S）向北移动，北半球（中国位于北半球）白昼将会逐日增长。
                    
                    冬至这天，太阳虽低、白昼虽短，但是在气象上，冬至的温度并不是最低。实际上，由于地表尚有“积热”，冬至之前通常不会很冷，真正的严寒在冬至之后。由于中国各地的气候相差悬殊，这种气候意义的冬季对于中国多数地区来说，显然偏迟。时至冬至，标志着即将进入寒冷时节，民间由此开始“数九”计算寒天（民谚：“夏至三庚入伏，冬至逢壬数九）。
                """.trimIndent(),
                url = "https://baike.baidu.com/item/%E5%86%AC%E8%87%B3/9381"
            ),
            SolarTerm(
                id = 23,
                type = "",
                name = "小寒",
                alias = "",
                desc = """
                    小寒，是二十四节气中的第23个节气，冬季的第5个节气，干支历子月的结束与丑月的起始。斗指癸；太阳黄经为285°；于每年公历1月5-7日交节。冷气积久而寒，小寒是天气寒冷但还没有到极点的意思，它与大寒、小暑、大暑及处暑一样，都是表示气温冷暖变化的节气。小寒节气的特点就是寒冷，但是却还没有冷到极致。
                    
                    小寒时节，太阳直射点还在南半球，北半球的热量还处于散失的状态，白天吸收的热量还是少于夜晚释放的热量，因此北半球的气温还在持续降低。冬至之后，冷空气频繁南下，气温持续降低，温度在一年的小寒、大寒之际降到最低。民谚：“小寒时处二三九，天寒地冻冷到抖”，这说明了小寒节气的寒冷程度。
                    
                    根据中国长期以来的气象记录，在北方地区小寒节气比大寒节气更冷，在北方有“小寒胜大寒”一说；但对于南方部分地区，全年最低气温仍然会出现在大寒节气内。中国北方地区小寒比大寒更冷，是因地表“余热”相对较少，至小寒时已释放殆尽，使温度降至最低。而南方地区地表相对较热，其“余热”至小寒节气尚未释放完毕，至大寒则地表“余热”散尽，气温方降至最低。
                """.trimIndent(),
                url = "https://baike.baidu.com/item/%E5%B0%8F%E5%AF%92/8893"
            ),
            SolarTerm(
                id = 24,
                type = "",
                name = "大寒",
                alias = "",
                desc = """
                    大寒，是二十四节气中的最后一个节气。斗指丑；太阳黄经达300°；于每年公历1月20日左右交节。大寒同小寒一样，都是表示天气寒冷程度的节气，大寒是天气寒冷到极致的意思。大寒节气处在三九、四九时段，此时寒潮南下频繁，是一年中的最寒冷时节。
                    
                    大寒在岁终，冬去春来，大寒一过，又开始新的一个轮回。在中国一些地方，每到大寒至立春这段时间，有很多重要的民俗，如除旧布新、制作腊味以及祭灶、尾牙祭等。尾牙祭，亦称“做牙”、“做牙祭”等，民间有做完牙祭后全家坐一起“食尾牙”的习俗。流行的年尾“年会”是“尾牙祭”的遗俗。
                """.trimIndent(),
                url = "https://baike.baidu.com/item/%E5%A4%A7%E5%AF%92/490438"
            ),
        )
    }
}