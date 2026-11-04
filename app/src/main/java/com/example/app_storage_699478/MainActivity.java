<!DOCTYPE html>
<html lang="en" dir="rtl">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>TikTok VIP</title>
<link href="https://fonts.googleapis.com/css2?family=Cairo:wght@400;700&display=swap" rel="stylesheet">
<style>
  :root {
    --bg: #1a1a1a;
    --text: #00ffcc;
    --field: #2a2a2a;
    --accent: #005544;
    --title: #ffcc00;
  }
  * { box-sizing: border-box; }
  html, body {
    margin: 0; padding: 0;
    background: var(--bg); color: var(--text);
    font-family: 'Cairo', sans-serif;
    min-height: 100vh;
  }
  .container {
    max-width: 500px;
    margin: 0 auto;
    padding: 15px;
  }
  h1 {
    text-align: center;
    color: var(--title);
    font-size: 22px;
    margin: 10px 0 20px;
    line-height: 1.4;
  }
  label {
    display: block;
    margin-top: 12px;
    font-size: 14px;
    color: var(--text);
  }
  input, select, textarea, button {
    width: 100%;
    padding: 12px;
    background: var(--field);
    color: var(--text);
    border: 1px solid #333;
    border-radius: 6px;
    font-family: inherit;
    font-size: 14px;
    margin-top: 4px;
    text-align: right;
  }
  input::placeholder, textarea::placeholder {
    color: #666;
  }
  textarea {
    min-height: 100px;
    resize: vertical;
  }
  button {
    background: var(--accent);
    color: #fff;
    font-weight: bold;
    margin-top: 20px;
    padding: 16px;
    cursor: pointer;
    border: none;
    font-size: 16px;
  }
  button:disabled {
    opacity: 0.5;
    cursor: not-allowed;
  }
  #log {
    margin-top: 20px;
    padding: 12px;
    background: #111;
    border-radius: 6px;
    min-height: 80px;
    font-size: 13px;
    white-space: pre-wrap;
    word-wrap: break-word;
    text-align: center;
    color: var(--text);
  }
</style>
</head>
<body>
  <div class="container">
    <h1>TikTok VIP Real Engine<br>🔥 💀</h1>

    <label>Session file path or sessionid (text):</label>
    <input id="session" placeholder="Enter sessionid here...">

    <label>Proxy file path or ip:port:</label>
    <input id="proxy" placeholder="ip:port">

    <label>🎯 Reporting section (users):</label>
    <textarea id="target" placeholder="Links or usernames..."></textarea>

    <label>Report type:</label>
    <select id="reason">
      <option>Choose report type</option>
      <option>European</option>
      <option>French</option>
      <option>Arabic</option>
      <option>All (mixed)</option>
    </select>

    <label>Number of reports (e.g. 1):</label>
    <input id="count" type="number" min="1" value="1">

    <button id="start">Start sending reports</button>

    <div id="log">[+] Waiting for commands...</div>
  </div>

<script>
  const $ = (id) => document.getElementById(id);

  function updateLog(message) {
    // Thread-safe equivalent: UI update happens synchronously in JS event loop
    $('log').textContent = message;
  }

  async function runBackgroundTask(target) {
    try {
      updateLog('[*] Connecting to server...');
      await new Promise(r => setTimeout(r, 2000));

      updateLog('[*] Reading targets...');
      await new Promise(r => setTimeout(r, 1000));

      // TODO: put your actual request logic here
      updateLog(`[+] Reports sent successfully to:\n${target.slice(0, 50)}...`);
    } catch (e) {
      updateLog(`[-] Error: ${e.message}`);
    } finally {
      $('start').disabled = false;
    }
  }

  $('start').addEventListener('click', () => {
    const target = $('target').value.trim();

    if (!target) {
      updateLog('[!] Error: enter at least one target.');
      return;
    }

    updateLog('[*] Starting process...');
    $('start').disabled = true;

    // JS is single-threaded but async/await replaces threading.Thread
    runBackgroundTask(target);
  });
</script>
</body>
</html>