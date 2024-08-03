package org.anime_game_servers.multi_proto.gi.data.activity.summer_time

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@ProtoModel
@AddedIn(Version.GI_1_6_0)
interface SummerTimeDetailInfo {
    var stageMap: Map<Int, SummerTimeStageInfo>
    var contentCloseTime: Int
    var isContentClosed: Boolean
    var sprintBoatInfo: SummerTimeSprintBoatInfo
}