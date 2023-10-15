package data.chat

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.OneOf
import org.anime_game_servers.annotations.OneOfType
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB2)
@ProtoModel
interface ChatInfo {
    var time: Int
    var uid: Int
    @AddedIn(VERSION.V1_2_0)
    var sequence: Int
    @AddedIn(VERSION.V1_2_0)
    var toUid: Int
    @AddedIn(VERSION.V1_2_0)
    var isRead: Boolean

    @OneOf(String::class, Int::class, SystemHint::class)
    var content:OneOfType
}