package org.anime_game_servers.multi_proto.gi.data.scene.map

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB2)
@ProtoCommand(REQUEST)
internal interface MarkMapReq {
    var mark: org.anime_game_servers.multi_proto.gi.data.scene.map.MapMarkPoint
    var old: org.anime_game_servers.multi_proto.gi.data.scene.map.MapMarkPoint
    var op: org.anime_game_servers.multi_proto.gi.data.scene.map.Operation
}
