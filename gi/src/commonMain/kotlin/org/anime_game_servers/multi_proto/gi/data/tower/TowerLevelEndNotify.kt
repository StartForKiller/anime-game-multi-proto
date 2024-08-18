package org.anime_game_servers.multi_proto.gi.data.tower

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam

@AddedIn(GI_0_9_0)
@ProtoCommand(NOTIFY)
internal interface TowerLevelEndNotify {
    var continueState: Int
    var finishedStarCondList: List<Int>
    var isSuccess: Boolean
    var nextFloorId: Int
    var rewardItemList: List<ItemParam>
}