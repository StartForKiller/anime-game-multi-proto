package data.activity

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V0_9_0)
@ProtoCommand(CommandType.NOTIFY)
interface ActivityUpdateWatcherNotify {
    var activityId: Int
    var watcherInfo: ActivityWatcherInfo
}