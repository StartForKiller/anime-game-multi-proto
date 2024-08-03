package org.anime_game_servers.multi_proto.gi.data.activity.sea_lamp.legacy

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.multi_proto.gi.data.activity.sea_lamp.SeaLampActivityPlayerInfo
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_CB2) @RemovedIn(Version.GI_0_9_0)
@ProtoCommand(CommandType.RESPONSE)
interface SeaLampGetActivityInfoRsp {
    var activityInfo: SeaLampActivityInfo
    var activityPlayerInfo: SeaLampActivityPlayerInfo
    var retcode: Int
}