package com.yuroyami.syncplay.lyricist

import com.yuroyami.syncplay.utils.format

val DeStrings = object : Strings {
    override val yes = "Ja"
    override val no = "Nein"
    override val okay = "Okay"
    override val cancel = "Abbrechen"
    override val dontShowAgain = "Nicht mehr anzeigen"
    override val play = "Abspielen"
    override val pause = "Pause"
    override val delete = "Löschen"
    override val confirm = "Bestätigen"
    override val done = "Fertig"
    override val close = "Schließen"
    override val off = "Aus"
    override val on = "An"
    override val tabConnect = "Verbinden"
    override val tabSettings = "Einstellungen"
    override val tabAbout = "Über"
    override val connectUsernameA = "Geben Sie Ihren Benutzernamen ein:"
    override val connectUsernameB = "Benutzername"
    override val connectUsernameC = "Ein Name Ihrer Wahl"
    override val connectRoomnameA = "Raumnamen einfügen:"
    override val connectRoomnameB = "Raumname"
    override val connectRoomnameC = "Raum, in dem Sie und Ihre Freunde zuschauen"
    override val connectServerA = "Syncplay-Server auswählen:"
    override val connectServerB = "Serveradresse"
    override val connectServerC = "Stellen Sie sicher, dass Sie und Ihre Freunde demselben Server beitreten."
    override val connectButtonJoin = "Raum beitreten"
    override val connectButtonSaveshortcut = "Aktuelle Konfiguration als Startverknüpfung speichern"
    override val connectButtonCurrentEngine = { p0: String -> "Aktueller Motor: %s".format(p0) }
    override val connectFootnote = "Inoffizieller Syncplay-Android-Client"
    override val connectUsernameEmptyError = "Benutzername darf nicht leer sein"
    override val connectRoomnameEmptyError = "Raumname darf nicht leer sein"
    override val connectAddressEmptyError = "Serveradresse darf nicht leer sein"
    override val connectPortEmptyError = "Port eingeben!"
    override val connectEnterCustomServer = "Benutzerdefinierten Server eingeben"
    override val connectCustomServerPassword = "Passwort (Leer, wenn nicht erforderlich)"
    override val connectPort = "Port"
    override val connectNightmodeswitch = "Tag-/Nachtmodus umschalten"
    override val connectSolomode = "Einzelmodus betreten (nur Video-Player)"
    override val roomSelectedVid = { p0: String -> "Ausgewählte Videodatei: %s".format(p0) }
    override val roomSelectedSub = { p0: String -> "Geladene Untertiteldatei: %s".format(p0) }
    override val roomSelectedSubError = "Ungültige Untertiteldatei. Unterstützte Formate sind: 'SRT', 'TTML', 'ASS', 'SSA', 'VTT'"
    override val roomSubErrorLoadVidFirst = "Laden Sie zuerst das Video"
    override val roomTypeMessage = "Geben Sie Ihre Nachricht ein…"
    override val roomReady = "Bereit"
    override val roomNotReady = "Nicht bereit"
    override val roomPingConnected = { p0: String -> "Verbunden - PING: %s ms".format(p0) }
    override val roomPingDisconnected = "Getrennt"
    override val roomOverflowSub = "Untertiteldatei laden…"
    override val roomOverflowMsghistory = "Nachrichtenverlauf"
    override val roomOverflowSettings = "Einstellungen"
    override val roomEmptyMessageError = "Geben Sie etwas ein!"
    override val roomAttemptingConnect = { p0: String, p1: String -> "Versuche, eine Verbindung herzustellen zu %1s:%2s".format(p0, p1) }
    override val roomConnectedToServer = "Mit dem Server verbunden."
    override val roomConnectionFailed = "Verbinden fehlgeschlagen."
    override val roomAttemptingReconnection = "Verbindung zum Server verloren."
    override val roomGuyPlayed = { p0: String -> "%s hat fortgesetzt".format(p0) }
    override val roomGuyPaused = { p0: String, p1: String -> "%1s pausierte bei %2s".format(p0, p1) }
    override val roomSeeked = { p0: String, p1: String, p2: String -> "%1s sprang von %2s auf %3s".format(p0, p1, p2) }
    override val roomRewinded = { p0: String -> "Zurückgespult aufgrund von Zeitunterschied mit %s".format(p0) }
    override val roomGuyLeft = { p0: String -> "%s hat den Raum verlassen.".format(p0) }
    override val roomGuyJoined = { p0: String -> "%s ist dem Raum beigetreten.".format(p0) }
    override val roomIsplayingfile = { p0: String, p1: String, p2: String -> "%1s spielt '%2s' ab (%3s)".format(p0, p1, p2) }
    override val roomYouJoinedRoom = { p0: String -> "Sie sind dem Raum beigetreten: %s".format(p0) }
    override val roomScalingFitScreen = "Größenanpassung: AN BILDSCHIRM ANPASSEN"
    override val roomScalingFixedWidth = "Größenanpassung: FESTE BREITE"
    override val roomScalingFixedHeight = "Größenanpassung: FESTE HÖHE"
    override val roomScalingFillScreen = "Größenanpassung: BILDSCHIRM FÜLLEN"
    override val roomScalingZoom = "Größenanpassung: Zoomen"
    override val roomSubTrackChanged = { p0: String -> "Untertitelspur geändert auf: %s".format(p0) }
    override val roomAudioTrackChanged = { p0: String -> "Audiospur geändert auf: %s".format(p0) }
    override val roomAudioTrackNotFound = "Kein Audio gefunden!"
    override val roomSubTrackDisable = "Untertitel deaktivieren"
    override val roomTrackTrack = "Spur"
    override val roomSubTrackNotfound = "Keine Untertitel gefunden!"
    override val roomDetailsCurrentRoom = { p0: String -> "Aktueller Raum: %s".format(p0) }
    override val roomDetailsNofileplayed = "(Keine Datei wird abgespielt)"
    override val roomDetailsFileProperties = { p0: String, p1: String -> "Dauer: %1s - Größe: %2s MB".format(p0, p1) }
    override val roomFileMismatchWarningCore = { p0: String -> "Ihre Datei unterscheidet sich von %s's Datei in folgenden Punkten: ".format(p0) }
    override val roomFileMismatchWarningName = "Name."
    override val roomFileMismatchWarningDuration = "Dauer."
    override val roomFileMismatchWarningSize = "Größe."
    override val roomSharedPlaylist = "Geteilte Playlist des Raums"
    override val roomSharedPlaylistBrief = "Importieren Sie eine Datei oder ein Verzeichnis, um Dateinamen in die Playlist aufzunehmen. Klicken Sie auf eine Dateizeile, um alle Benutzer dazu zu bringen, sie abzuspielen."
    override val roomSharedPlaylistUpdated = { p0: String -> "%s hat die Playlist aktualisiert".format(p0) }
    override val roomSharedPlaylistChanged = { p0: String -> "%s hat die aktuelle Auswahl der Playlist geändert".format(p0) }
    override val roomSharedPlaylistNoDirectories = "Sie haben keine Medienverzeichnisse für geteilte Playlists angegeben. Fügen Sie die Dateien manuell hinzu."
    override val roomSharedPlaylistNotFound = "Syncplay konnte die Datei, die gerade in der geteilten Playlist in Ihren Medienverzeichnissen abgespielt wird, nicht finden."
    override val roomSharedPlaylistNotFeatured = "Dieser Raum oder Server unterstützt die Funktion für geteilte Playlists nicht."
    override val roomSharedPlaylistButtonAddFile = "Datei(en) am Ende der Playlist hinzufügen"
    override val roomSharedPlaylistButtonAddFolder = "Ordner zur Playlist hinzufügen (und Medienverzeichnisse)"
    override val roomSharedPlaylistButtonAddUrl = "URL(s) am Ende der Playlist hinzufügen"
    override val roomSharedPlaylistButtonShuffle = "Gesamte Playlist mischen"
    override val roomSharedPlaylistButtonShuffleRest = "Restliche Playlist mischen"
    override val roomSharedPlaylistButtonOverflow = "Weitere Einstellungen für geteilte Playlist"
    override val roomSharedPlaylistButtonPlaylistImport = "Playlist aus Datei laden"
    override val roomSharedPlaylistButtonPlaylistImportNShuffle = "Playlist aus Datei laden und mischen"
    override val roomSharedPlaylistButtonPlaylistExport = "Playlist in Datei speichern"
    override val roomSharedPlaylistButtonSetMediaDirectories = "Medienverzeichnisse festlegen"
    override val roomSharedPlaylistButtonSetTrustedDomains = "Vertrauenswürdige Domains festlegen"
    override val roomSharedPlaylistButtonUndo = "Letzte Änderung rückgängig machen"
    override val roomButtonDescAspectRatio = "Seitenverhältnis"
    override val roomButtonDescSharedPlaylist = "Geteilte Playlist"
    override val roomButtonDescAudioTracks = "Audiospuren"
    override val roomButtonDescSubtitleTracks = "Untertitelspuren"
    override val roomButtonDescRewind = "Zurückspulen"
    override val roomButtonDescToggle = "."
    override val roomButtonDescPlay = "Abspielen"
    override val roomButtonDescPause = "Pause"
    override val roomButtonDescFfwd = "Vorspulen"
    override val roomButtonDescAdd = "Mediendatei hinzufügen"
    override val roomButtonDescLock = "Touch-Sperre"
    override val roomButtonDescMore = "Weitere Einstellungen"
    override val roomAddmediaOffline = "Von Telefon speichern"
    override val roomAddmediaOnline = "Von einer Netzwerk-URL"
    override val roomAddmediaOnlineUrl = "URL-Adresse"
    override val mediaDirectories = "Medienverzeichnisse für geteilte Playlist"
    override val mediaDirectoriesBrief = "Syncplay durchsucht die hier angegebenen Medienverzeichnisse, um den Namen einer geteilten Playlist zu finden. Es ist besser, wenn Sie kleine Verzeichnisse angeben, da die Suchoperation sonst gedrosselt und sehr langsam sein kann."
    override val mediaDirectoriesSettingSummary = "Syncplay durchsucht die hier angegebenen Medienverzeichnisse, um den Namen einer geteilten Playlist zu finden."
    override val mediaDirectoriesSave = "Speichern & Beenden"
    override val mediaDirectoriesClearAll = "Alles löschen"
    override val mediaDirectoriesClearAllConfirm = "Möchten Sie die Liste wirklich löschen?"
    override val mediaDirectoriesAddFolder = "Ordner hinzufügen"
    override val mediaDirectoriesDelete = "Aus der Liste entfernen"
    override val mediaDirectoriesShowFullPath = "Vollständigen Pfad anzeigen"
    override val settingsCategGeneral = "Allgemeine Einstellungen"
    override val settingsCategPlayer = "Player-Einstellungen"
    override val settingsCategRoom = "Raum-Einstellungen"
    override val settingsCategVideo = "Video-Einstellungen"
    override val settingsCategMisc = "Verschiedenes"
    override val settingNightModeTitle = "Nachtmodus"
    override val settingNightModeSummary = "Wählen Sie das Verhalten des Nachtmodus aus."
    override val settingRememberJoinInfoTitle = "Letzte Anmeldedaten merken"
    override val settingRememberJoinInfoSummary = "Standardmäßig aktiviert. Dadurch kann SyncPlay Ihren letzten Benutzernamen, Raumnamen und den zuletzt verwendeten offiziellen Server speichern."
    override val settingDisplayLanguageTitle = "Anzeigesprache"
    override val settingDisplayLanguageSummry = "Wählen Sie die Sprache aus, in der Syncplay angezeigt wird."
    override val settingDisplayLanguageToast = "Sprache geändert. Starten Sie die App neu, damit die Einstellung vollständig wirksam wird."
    override val settingAudioDefaultLanguageTitle = "Bevorzugte Audiosprache"
    override val settingAudioDefaultLanguageSummry = "Laden Sie automatisch eine Audiospur mit dem hier festgelegten Sprachcode. " +
            "Zum Beispiel ist der englische Code 'en-US', der japanische 'ja-JP'. Suchen Sie nach 'IETF BCP 47 codes' für weitere Informationen."
    override val settingCcDefaultLanguageTitle = "Bevorzugte Untertitelsprache"
    override val settingCcDefaultLanguageSummry = "Laden Sie automatisch eine Untertitelspur mit dem hier festgelegten Sprachcode. " +
            "Zum Beispiel ist der englische Code 'en-US', der japanische 'ja-JP'. Suchen Sie nach 'IETF BCP 47 codes' für weitere Informationen."
    override val settingUseBufferTitle = "Benutzerdefinierte Puffergrößen verwenden"
    override val settingUseBufferSummary = "Wenn Sie mit den Ladezeiten des Videos vor und während der Wiedergabe des Players nicht zufrieden sind, können Sie benutzerdefinierte Puffergrößen verwenden (auf eigene Gefahr)."
    override val settingMaxBufferTitle = "Benutzerdefinierte maximale Puffergröße"
    override val settingMaxBufferSummary =
        "Standardmäßig sind es 30 (30000 Millisekunden). Dies bestimmt die maximale Puffergröße, bevor das Video abgespielt wird. Ändern Sie dies nicht, wenn Sie nicht wissen, was das ist."
    override val settingMinBufferSummary =
        "Standardmäßig sind es 15 (15000 Millisekunden). Verringern Sie diesen Wert, um das Video schneller abzuspielen, aber es besteht die Möglichkeit, dass der Player fehlschlägt oder sogar abstürzt. Ändern Sie auf eigene Gefahr."
    override val settingMinBufferTitle = "Benutzerdefinierte minimale Puffergröße"
    override val settingPlaybackBufferSummary =
        "Standardmäßig sind es 2500 Millisekunden. Dies repräsentiert die Puffergröße beim SUCHE oder FORTSETZEN des Videos. Ändern Sie dies, wenn Sie mit der kleinen Verzögerung beim Suchen des Videos nicht zufrieden sind."
    override val settingPlaybackBufferTitle = "Benutzerdefinierte Puffergröße für die Wiedergabe (ms)"
    override val settingReadyFirsthandSummary = "Aktivieren Sie dies, wenn Sie automatisch als bereit gesetzt werden möchten, sobald Sie den Raum betreten."
    override val settingReadyFirsthandTitle = "Als bereit aus erster Hand setzen"
    override val settingRewindThresholdSummary = "Wenn jemand mit dem von Ihnen hier ausgewählten Wert zurückliegt, wird Ihr Video zurückgespult, um mit dem zurückliegenden abzugleichen."
    override val settingRewindThresholdTitle = "Rückspulschwelle"
    override val settingTlsSummary = "Wenn ein Server eine sichere TLS-Verbindung unterstützt, versucht Syncplay Android, über TLS eine Verbindung herzustellen. (Noch nicht verfügbar)"
    override val settingTlsTitle = "Sichere Verbindung verwenden (TLSv1.3) [Demnächst verfügbar]"
    override val settingResetdefaultTitle = "Einstellungen auf Standard zurücksetzen"
    override val settingResetdefaultSummary = "Alles auf den Standardwert zurücksetzen (Empfohlen)"
    override val settingResetdefaultDialog = "Möchten Sie die Einstellungen für diesen Bildschirm wirklich löschen?"
    override val settingPauseIfSomeoneLeftTitle = "Anhalten, wenn jemand geht"
    override val settingPauseIfSomeoneLeftSummary = "Aktivieren Sie dies, wenn Sie möchten, dass die Wiedergabe pausiert/stoppt, wenn jemand den Raum verlässt, während Sie zuschauen."
    override val settingWarnFileMismatchTitle = "Warnung bei Dateiabweichung"
    override val settingWarnFileMismatchSummary =
        "Standardmäßig aktiviert. Dies warnt Sie, wenn Sie eine Datei laden, die sich von den Benutzern in der Gruppe unterscheidet (in Bezug auf Name, Dauer oder Größe, nicht alles)."
    override val settingFileinfoBehaviourNameTitle = "Dateinameninformation senden"
    override val settingFileinfoBehaviourNameSummary = "Wählen Sie die Methode aus, mit der Sie anderen Benutzern Ihren hinzugefügten Dateinamen anzeigen möchten."
    override val settingFileinfoBehaviourSizeTitle = "Dateigrößeninformation senden"
    override val settingFileinfoBehaviourSizeSummary = "Wählen Sie die Methode aus, mit der Sie anderen Benutzern Ihre hinzugefügte Dateigröße anzeigen möchten."
    override val uisettingApply = "ANWENDEN"
    override val uisettingTimestampSummary = "Deaktivieren Sie dies, um die Zeitstempel am Anfang von Chat-Nachrichten zu verbergen."
    override val uisettingTimestampTitle = "Chat-Zeitstempel"
    override val uisettingMsgoutlineSummary = "Aktivieren Sie dies, um Chat-Nachrichten einen Umriss zu geben, um das Verschmelzen mit dem Hintergrundvideo zu reduzieren."
    override val uisettingMsgoutlineTitle = "Umriss der Chat-Nachricht"
    override val uisettingMsgshadowSummary = "Aktivieren Sie dies, um Chat-Nachrichten einen Schatten zu geben, um das Verschmelzen mit dem Hintergrundvideo zu reduzieren."
    override val uisettingMsgshadowTitle = "Schatten der Chat-Nachricht"
    override val uisettingMsgboxactionSummary =
        "Wenn dies aktiviert ist, sendet das Klicken auf die Schaltfläche 'OK' auf Ihrer Tastatur die Nachricht. Wenn dies deaktiviert ist, wird die Tastatur einfach geschlossen, ohne etwas zu tun."
    override val uisettingMsgboxactionTitle = "Funktion der OK-Taste auf der Tastatur"
    override val uisettingOverviewAlphaSummary = "Standardmäßig sind es 40 (Fast transparent), ändern Sie dies, wenn Sie die Lesbarkeit des Panel für Raumdetails durch Erhöhen der Opazität verbessern möchten."
    override val uisettingOverviewAlphaTitle = "Hintergrundopazität der Raumdetails"
    override val uisettingMessageryAlphaSummary = "Standardmäßig ist es 0 (transparent). Maximum ist 255 (100% Undurchsichtig). Erhöhen Sie die Lesbarkeit der Nachrichten, indem Sie den Hintergrund undurchsichtiger machen."
    override val uisettingMessageryAlphaTitle = "Opazität des Nachrichtenhintergrunds"
    override val uisettingMsgsizeSummary = "Ändert die Schriftgröße der Nachrichten. Standardmäßig sind es 10."
    override val uisettingMsgsizeTitle = "Schriftgröße der Nachrichten"
    override val uisettingMsgcountSummary = "Standardmäßig sind es 10. Begrenzt die Anzahl der Nachrichten auf diesen Wert."
    override val uisettingMsgcountTitle = "Maximale Anzahl der Nachrichten"
    override val uisettingMsglifeSummary = "Wenn Sie eine Chat-Nachricht oder Raumnachricht erhalten, wird sie für die unten eingestellte Zeit ausgeblendet."
    override val uisettingMsglifeTitle = "Anzeigedauer für Chat-Nachrichten"
    override val uisettingTimestampColorSummary = "Passen Sie die Textfarbe der Nachrichtenzeitstempel an (Standardmäßig Pink)"
    override val uisettingTimestampColorTitle = "Textfarbe des Zeitstempels"
    override val uisettingSelfColorSummary = "Passen Sie die Textfarbe Ihres Namensetiketts an (Standardmäßig Dunkelrot)"
    override val uisettingSelfColorTitle = "Farbe des eigenen Namensetiketts"
    override val uisettingFriendColorSummary = "Passen Sie die Textfarbe der Namensetiketten Ihrer Freunde an (Standardmäßig Blau)"
    override val uisettingFriendColorTitle = "Textfarbe des Namensetiketts für Freunde"
    override val uisettingSystemColorSummary = "Passen Sie die Textfarbe der Systemraumnachrichten an (Standardmäßig Weiß)"
    override val uisettingSystemColorTitle = "Textfarbe der Systemnachrichten"
    override val uisettingHumanColorSummary = "Passen Sie die Textfarbe der Benutzernachrichten an (Standardmäßig Weiß)"
    override val uisettingHumanColorTitle = "Textfarbe der Benutzernachrichten"
    override val uisettingErrorColorSummary = "Passen Sie die Textfarbe der Fehlermeldungen an (Standardmäßig Rot)"
    override val uisettingErrorColorTitle = "Textfarbe der Fehlermeldungen"
    override val uisettingSubtitleSizeSummary =
        "Dies ändert die Untertitelgröße für zusätzliche Untertitel (wenn Sie sie aus einer Datei laden). Standardmäßig sind es 16. Die Untertitelgröße für integrierte Untertitel kann nicht geändert werden."
    override val uisettingSubtitleSizeTitle = "Untertitelgröße"
    override val uisettingSubtitleDelaySummary = "Standardmäßig sind es 0 Millisekunden. Dies verzögert oder beschleunigt die Untertitelspur. Verwenden Sie negative Werte, um sie zu beschleunigen."
    override val uisettingSubtitleDelayTitle = "Verzögerung der Untertitel (Millisekunden)"
    override val uisettingAudioDelaySummary = "Standardmäßig sind es 0 Millisekunden. Dies verzögert oder beschleunigt die Audiospur. Verwenden Sie negative Werte, um sie zu beschleunigen."
    override val uisettingAudioDelayTitle = "Verzögerung der Audiospur (Millisekunden)"
    override val uisettingSeekForwardJumpSummary = "Legt fest, wie viele Sekunden ein Vorlauf überspringen soll. Standardmäßig sind es 10 Sekunden."
    override val uisettingSeekForwardJumpTitle = "Sprungmenge bei Vorlauf (Sekunden)"
    override val uisettingSeekBackwardJumpSummary = "Legt fest, wie viele Sekunden ein Rücklauf zurückspulen soll. Standardmäßig sind es 10 Sekunden."
    override val uisettingSeekBackwardJumpTitle = "Sprungmenge bei Rücklauf (Sekunden)"
    override val uisettingPipSummary = "Ob der Player in den fensterbasierten Bild-in-Bild-Modus wechseln soll, wenn die App minimiert wird. Standardmäßig ist dies true"
    override val uisettingPipTitle = "Bild-in-Bild-Modus"
    override val uisettingReconnectIntervalSummary = "Wie viele Sekunden auf eine erneute Verbindung warten sollen, wenn die Verbindung oder Trennung fehlschlägt. Standardmäßig sind es 2 Sekunden."
    override val uisettingReconnectIntervalTitle = "Intervall für erneute Verbindung"
    override val uisettingResetdefaultSummary = "Alle oben genannten Einstellungen auf den Standardwert zurücksetzen."
    override val uisettingResetdefaultTitle = "Einstellungen auf Standard zurücksetzen"
    override val settingFileinfoBehaviorA = "Rohe Daten senden"
    override val settingFileinfoBehaviorB = "Gehasht senden"
    override val settingFileinfoBehaviorC = "Nicht senden"
}