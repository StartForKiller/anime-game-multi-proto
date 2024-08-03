package org.anime_game_servers.multi_proto.gi.data.community

import org.anime_game_servers.multi_proto.gi.data.community.friends.FriendBrief
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_0_0)
@ProtoCommand(RESPONSE)
internal interface GetRecentMpPlayerListRsp {
    var recentMpPlayerBriefList: List<FriendBrief>
    var retcode: Int
}
