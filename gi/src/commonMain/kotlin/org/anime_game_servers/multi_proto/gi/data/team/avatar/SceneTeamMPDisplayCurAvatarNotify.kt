package org.anime_game_servers.multi_proto.gi.data.team.avatar

import org.anime_game_servers.multi_proto.gi.data.scene.MPDisplayCurAvatar
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB2)
@RemovedIn(GI_1_0_0)
@ProtoCommand(NOTIFY)
internal interface SceneTeamMPDisplayCurAvatarNotify {
    var displayCurAvatar: MPDisplayCurAvatar
}
