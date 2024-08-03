package org.anime_game_servers.multi_proto.gi.data.shop

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_2_0)
@ProtoModel("ShopCardProduct")
internal interface ResinCard {
    var baseItemList: List<org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam>
    var perDayItemList: List<org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam>
}