/*
Copyright 2016-2018 Bowler Hat LLC

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

	http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.as3mxml.vscode.debug.responses;

import java.util.List;

import com.as3mxml.vscode.debug.protocol.Response;

public class ScopesResponseBody extends Response.ResponseBody
{
    public Scope[] scopes;

    public ScopesResponseBody()
    {
        this.scopes = new Scope[0];
    }

    public ScopesResponseBody(List<Scope> scopes)
    {
        this.scopes = scopes.toArray(new Scope[scopes.size()]);
    }
}